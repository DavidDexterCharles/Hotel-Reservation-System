<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');

class Site extends CI_Controller {
	
	private $tableName1 = "guest";
	private $tableName2 = "";
	private $tableName3 = "users";
	
	

		 
	 
     

	public function index()
	{
		$this->load->view('main_app');
		
	}
	
	
	public function siteInfo(){		
		$this->load->view('main_app');
		$this->load->view('addReservationForm');
		}
	
	
	
	
	
		
	public function addReservation(){	
		
		
		
		$this->load->library('form_validation');
		
		$this->form_validation->set_rules('firstName', 'First Name', 'trim|required|min_length[3]|max_length[14]|xss_clean');
		$this->form_validation->set_rules('lastName', 'Last Name', 'trim|required|min_length[3]|max_length[14]|xss_clean');
		$this->form_validation->set_rules('contact', 'Contact', 'trim|required|min_length[6]|max_length[15]|xss_clean');
		$this->form_validation->set_rules('address', 'Address', 'trim|required|min_length[3]|max_length[100]|xss_clean');
		$this->form_validation->set_rules('email', 'Email Address', 'trim|required|min_length[6]|max_length[50]|valid_email|xss_clean');
		$this->form_validation->set_rules('cardType', 'Credit Card Type', 'trim|required|min_length[3]|max_length[15]|xss_clean');
		$this->form_validation->set_rules('cardNum', 'Credit Card Number', 'trim|required|min_length[3]|max_length[15]|xss_clean');
		
		
		if($this->form_validation->run()== FALSE){
			$this->load->view('main_app');
			$this->load->view("addReservationForm");
			
		}
		else{
		
				$firstName = $this->input->post("firstName");
				$lastName = $this->input->post("lastName");
				$contact =  $this->input->post("contact");		
				$email =  $this->input->post("email");		
				$address =  $this->input->post("address");	
				$inDate = $this->input->post("inDate");
				//$outDate = $this->input->post("outDate");
				$roomType =  $this->input->post("roomType");		
				$cardType =  $this->input->post("cardType");		
				$cardNum =  $this->input->post("cardNum");	
			
					
			
				
				
				
				$roomQuery = $this->db->query('SELECT DISTINCT r.RoomNumber
												From room r, roomtype rt, guest g
												Where r.roomNumber NOT IN ( SELECT r.RoomNumber
																			From room r, guest g
																			Where g.roomNumber = r.RoomNumber
																			 AND CheckOutDate = "0000-00-00 00:00:00"	
																				) 
												AND rt.TypeID = r.TypeID
												AND rt.TypeName ="'.$roomType.'";
												');
				
				
					
				
				
				
				$row = $roomQuery->row();
				
				
				if($row!=NULL){
					$roomNum = $row->RoomNumber;
					$reservations = array("FirstName"=>$firstName,"LastName"=>$lastName,"Contact"=>$contact,"Email"=>$email,"Address"=>$address,"CheckInDate"=>$inDate,/* "CheckOutDate"=>$outDate,*/ "CreditCardType"=>$cardType, "CreditCardNumber"=>$cardNum, "RoomNumber"=>$roomNum);	
					$this->db->insert($this->tableName1, $reservations);
					
					$this->load->view('main_app');
					$this->load->view('reservationSuccess');
					$this->load->view('myReservations');
				}
				else{
				$this->load->view('main_app');
				$this->load->view('addReservationForm');
				$this->load->view('roomUnavailable');
				}
		}
	}
	
	
	
	
	public function viewReservations(){
			$username = $this->session->userdata('username');
			
			$this->load->library('table');

			$email = $this->db->query("SELECT email FROM users u
										Where u.username ='".$username."';");
			
			
			
			if ($email->num_rows() > 0)
				{
				   $row = $email->row(); 

				   $email2 = $row->email;
				  
				}
			
			$query = $this->db->query("SELECT * from guest g Where g.Email = '".$email2."';");
			
			$this->load->view('main_app');
			echo $this->table->generate($query);
		
}

	public function addUser(){	
		
		
		$this->load->library('form_validation');
		
		$this->form_validation->set_rules('firstName', 'First Name', 'trim|required|min_length[3]|max_length[14]|xss_clean');
		$this->form_validation->set_rules('lastName', 'Last Name', 'trim|required|min_length[3]|max_length[14]|xss_clean');
		$this->form_validation->set_rules('email', 'Email Address', 'trim|required|min_length[6]|max_length[50]|valid_email|is_unique[users.email]|xss_clean');
		$this->form_validation->set_rules('password', 'Password', 'trim|required|min_length[6]|max_length[20]|matches[confirmPassword]|xss_clean');
		$this->form_validation->set_rules('confirmPassword', 'Confirmed Password', 'trim|required|min_length[3]|max_length[14]|xss_clean');
		
		if($this->form_validation->run()== FALSE){
			$this->load->view('main_app');
			$this->load->view('signup_view');
		}
		else{
			//this->load->model('admin_model');
			$firstName = $this->input->post("firstName");
			$lastName =  $this->input->post("lastName");
			$email =  $this->input->post("email");
			$username = $this->input->post("username");
			$password =  $this->input->post("password");
			
			
					
			
			
			
			$user = array("firstName"=>$firstName,"lastName"=>$lastName, "username"=>$username,"password"=>$password, "email"=>$email);		
			$this->db->insert($this->tableName3, $user);
			$this->load->view('main_app');
			$this->load->view('signup_view');
			$this->load->view('signup_success');
			
			
			
		}
		
		
	}
	
	
	
	
	public function view(){		
		$reservation = $this->db->get($this->tableName1);		
		
		echo json_encode($reservation->result());		
	}
}

