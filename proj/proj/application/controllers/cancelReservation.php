<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');

class CancelReservation extends CI_Controller {
	
		private $tableName1 = "guest";
		
		public function cancel_reservation(){
				$resNumber = $this->input->post("reservationNumber");
				$currTime = $this->db->query("SELECT NOW();")->row_array()['NOW()'];
				
				$data = array('CheckOutDate' => $currTime);
				
				
				$this->db->where('ReservationNumber', $resNumber);
				$this->db->update('guest', $data); 
				
				
				
				/*$checkInDate = $this->db->query("SELECT CheckInDate FROM guest g
											WHERE g.ReservationNumber ='".$resNumber."';");
			
			
			
				if ($checkInDate->num_rows() > 0)
				{
				   $row = $checkInDate->row(); 

				   $checkInDate2 = $checkInDate->CheckInDate;
				  
				}
				*/
					
				
				
				$this->db->trans_start();
				
				$this->db->query("UPDATE guest g SET BillingInfo = ( 
																	SELECT 
																	DATEDIFF( DATE( `CheckOutDate` ) , DATE( `CheckInDate` ) ) * rt.RoomRate 
																	FROM room r, roomtype rt
																	WHERE g.roomNumber = r.RoomNumber
																	AND rt.TypeID = r.TypeID
																	) ;");
				$this->db->trans_complete();
				
				$this->load->view('main_app');
				$this->load->view('myReservations');
				
		
		}
}