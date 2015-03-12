<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');

class authenticateUser extends CI_Controller {

	function authenticate_user(){	
		    
			
			$username = $this->input->post('username');
		    $password  = $this->input->post('password');
		   
			 $this->load->library('form_validation');

		    $this->form_validation->set_rules('username', 'Username', 'trim|required|xss_clean');
			$this->form_validation->set_rules('password', 'Password', 'trim|required|xss_clean|callback_check_database');

			if($this->form_validation->run() == FALSE)
			{
				$this->load->view('main_app');	
				$this->load->view('login_view');
			}
			else
			{

				$query = $this->db->query("SELECT * FROM users WHERE username='".$username."' AND password='".$password."'");
				
				if ($query->num_rows() > 0){
						
						$sess_array = array('username'=> $username,'loggedin' => true);
						$this->session->set_userdata($sess_array);
						
						
						$this->load->view('main_app');
						$this->load->view('home_view');
						
				}
				else{
					$this->load->view('main_app');	
					$this->load->view('login_view');
				}
			}
	}
}