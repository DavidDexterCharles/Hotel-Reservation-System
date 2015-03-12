<?php 
	
	class Admin_Model extends CI_Model{
	
	
		public function verifyUser($username,$password){
			
			$q = $this->db
					->where('username',$username)
					->where('password',$password)
					->get('users');
					
			if($q->num_rows >0){
				return $q->row();
			}
			return FALSE;
		}
}