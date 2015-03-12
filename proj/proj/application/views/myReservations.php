<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">

        <link rel="stylesheet" href="<?php echo base_url(); ?>css/bootstrap.min.css">
        <style>
            body {
                padding-top: 60px;
                padding-bottom: 40px;
			
				
            }
			
        </style>
        <script src="<?php echo base_url(); ?>js/vendor/jquery-1.8.3.min.js"></script>
		<link rel="stylesheet" href="<?php echo base_url(); ?>css/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="<?php echo base_url(); ?>css/main.css">
		<link rel="stylesheet" href="<?php echo base_url(); ?>css/bootstrap-datetimepicker.min.css">
		
		
		
    
  </head>

	
 <body>	
	
	
	
		<div class="container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 panel panel-default">				
				
				
				
				
				<?php 
					
						$username = $this->session->userdata('username');
						
						$this->load->library('table');

						$email = $this->db->query("SELECT email FROM users u
													Where u.username ='".$username."';");
						
						
						
						if ($email->num_rows() > 0)
							{
							   $row = $email->row(); 

							   $email2 = $row->email;
							  
							}
						
						$query = $this->db->query("SELECT * from guest g
												Where g.Email = '".$email2."'
												AND g.CheckOutDate = '0000-00-00 00:00:00';");
						
						
					?>
					
					
					<?php if ($query->num_rows() > 0){ ?>	
							<form id="formid1" class="form-horizontal" method="post" action="<?php echo base_url(); ?>index.php/cancelReservation/cancel_reservation">		
								<table class = "table">	
									<thead>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Check In Date</th>
										<th>Credit Card Type</th>
										<th>Room Number</th>
										<th>Cancel Reservation</th>
									</thead>
									
									<tbody>
									
											
									<?php foreach($query->result_array() as $row): ?>
											<tr> 

												<td><?php echo $row['FirstName']; ?></td>
												<td><?php echo $row['LastName']; ?></td>
												<td><?php echo $row['CheckInDate']; ?></td>
												<td><?php echo $row['CreditCardType']; ?></td>
												<td><?php echo $row['RoomNumber']; ?></td>
												<td><button class="btn btn-mini" name = "reservationNumber" type="submit" value = "<?php echo $row['ReservationNumber']; ?>">Click to Cancel Reservation</button></td>


											</tr>
									<?php endforeach; ?>

								</tbody>
							</table>
							
							</form>
					
					
					<?php }
						else{ ?>
						
							<p>You currently have no reservations</p>
					<?php } ?>
					
					</div>
				</div>
			</div>
				
				
	
		<script src="<?php echo base_url(); ?>js/bootstrap-datetimepicker.min.js"></script>
		<script src="<?php echo base_url(); ?>js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>
   
		
       
		<script src="<?php echo base_url(); ?>js/vendor/jquery.ba-bbq.js"></script>
		<script src="<?php echo base_url(); ?>js/vendor/jstorage.js"></script>
        <script src="<?php echo base_url(); ?>js/vendor/bootstrap.min.js"></script>
		<script src="<?php echo base_url(); ?>js/bootstrap-datepicker.js"></script>
        <script src="<?php echo base_url(); ?>js/main.js"></script>
</body>
	
	

