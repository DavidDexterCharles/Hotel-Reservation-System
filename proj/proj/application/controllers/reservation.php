<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');

class Site extends CI_Controller {
	
	private $tableName = "reservation";

	public function index()
	{
		$this->load->view('main_app');
	}
	
	public function addReservation(){	
		$inDate = $this->input->post("inDate");
		$outDate = $this->input->post("outDate");
		$roomType =  $this->input->post("roomType");		
		$cardType =  $this->input->post("cardType");		
		$cardNum =  $this->input->post("cardNum");	
		
				
		
		
		
		$reservations = array("CheckinDate"=>$inDate, "CheckoutDate"=>$outDate, "RoomType"=>$roomType, "CardType"=>$cardType, "CardNumber"=>$cardNum);		
		$this->db->insert($this->tableName, $reservations);
		
		$this->load->view('main_app');
		$this->load->view('addReservationForm');
	}
	
	public function addReservationForm(){		
		$this->load->view("addReservationForm");
	}
	
	public function view(){		
		$site = $this->db->get($this->tableName);		
		echo json_encode($site->result());		
	}
}