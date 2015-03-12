<?php  if ( ! defined('BASEPATH')) exit('No direct script access allowed');


class Admin extends CI_Controller{

	function __construct(){
		parent::__construct();
		session_start();
	}
	 
	
	
	public function index(){
		
		
		//$this->load->library('form_validation');
		
		//$this->load->form_validation->set_rules('password','password','required|min_length[6]');
		$this->load->view('login_view');
	

	
	
		//if($this->form_validation->run() !== FALSE){
			$this->load->model('admin_model');
			
			$result = $this->admin_model->verifyUser($this->input->post('username'), $this->input->post('password'));
			
			if($result !== FALSE){
				$_SESSION['username'] = $this->input->post('username');
				 $data['welcome'] = "Welcomeqwe ".ucfirst($this->session->userdata('username'));
				redirect('welcome');
			}
	
	
		
	
	}
}