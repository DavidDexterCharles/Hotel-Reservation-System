<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');

class Login extends CI_Controller {

 function __construct()
 {
   parent::__construct();
 }

 function index()
 {
   
	$this->load->view('main_app');
	$this->load->view('home_view');
 }

}

?>