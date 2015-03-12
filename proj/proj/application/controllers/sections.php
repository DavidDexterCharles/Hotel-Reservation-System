<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');

class Sections extends CI_Controller {
	public function index()
	{
		$this->load->view('main_app');
		$this->load->view('home_view');
	}
	
	
	public function home(){
			
		$this->load->view('main_app');
		$this->load->view('home_view');
		
	}
	

		
	public function reservation(){		
			$this->load->view('main_app');
			$this->load->view('addReservationForm');
			
	}
	
	public function myReservations(){		
		$this->load->view('main_app');
		$this->load->view('myReservations');
	
		
	}
	
	public function contact(){
			
		$this->load->view('main_app');
		$this->load->view("contact");
	}
	
	
	
	public function about(){
			
		$this->load->view('main_app');
		$this->load->view("about");
	}
	
	public function login(){
		$this->load->view('main_app');	
		$this->load->view('login_view');
		
	}
	
	public function logout(){
		$this->session->sess_destroy();	
		$this->load->view('main_app');
		$this->load->view('home_view');
		
	}
	
	public function signup(){
		$this->load->view('main_app');	
		$this->load->view('signup_view');
		
	}
	
	
	
		
	
	
}