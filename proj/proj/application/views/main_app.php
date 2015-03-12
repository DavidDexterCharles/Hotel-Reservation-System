<!DOCTYPE html>
<html class="no-js">
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
			 background: transparent;
				
            }
			.panel {
            background-color: rgba(255, 255, 255, 0.9);
			}

			.margin-base-vertical {
				margin: 40px 0;
			}
			.container{
				opacity: 0.8
			}
				
        </style>
        <script src="<?php echo base_url(); ?>js/vendor/jquery-1.8.3.min.js"></script>
		<script src="<?php echo base_url(); ?>js/jquery.backstretch.min.js"></script>
		
		<script>
 
			$.backstretch("<?php echo base_url(); ?>img/green.jpg");
		</script>
		
		<link rel="stylesheet" href="<?php echo base_url(); ?>css/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="<?php echo base_url(); ?>css/main.css">
		<link rel="stylesheet" href="<?php echo base_url(); ?>css/bootstrap-datetimepicker.min.css">
		<link rel="stylesheet" href="<?php echo base_url(); ?>css/bootstrap-combined.min.css">
		
        
		<script src="<?php echo base_url(); ?>js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>
    </head>
    <body>
       
			
				
				
					
					
			
						
						<div class="container">
							<div class="row">
								
								
									<div id="headingText" class = "col-md-6 col-md-offset-5">
								
										<h1>The Hotel</h1>
								
									</div>
								<div class="col-md-8 col-md-offset-2 ">
									<div class="bs-component">
										<div class="navbar navbar-inverse">
									<?php  
										if(!$this->session->userdata('loggedin')){?>
										
											<div class="navbar-collapse collapse navbar-inverse-collapse">
												<ul class="nav navbar-nav">
													<li class="active"><a href="<?php echo base_url(); ?>index.php/sections/home">Home</a></li>
													
													<li><a href="<?php echo base_url(); ?>index.php/sections/contact">Contact Us</a></li>
													<li><a href="<?php echo base_url(); ?>index.php/sections/signup">Sign Up</a></li>
													<li><a href="<?php echo base_url(); ?>index.php/sections/login">Login</a></li>
												
												</ul>
										
										
										
											</div>
										
										
										<?php }
										else{ 
										?>
											
											<div class="navbar-collapse collapse navbar-inverse-collapse">
												<ul class="nav navbar-nav">
													<li class="active"><a href="<?php echo base_url(); ?>index.php/sections/home">Home</a></li>
													<li><a href="<?php echo base_url(); ?>index.php/sections/reservation">Make A Reservation</a></li>
													<li><a href="<?php echo base_url(); ?>index.php/sections/myReservations">My Reservations</a></li>
													<li><a href="<?php echo base_url(); ?>index.php/sections/contact">Contact Us</a></li>
													<li><a href="<?php echo base_url(); ?>index.php/sections/logout">Logout</a></li>
													
												
												</ul>
										
										
										
											</div>
										
										
										<?php
										} 
										?>
										</div>
									</div>
					
								</div>
							</div>
						</div>
    		
			

				
		
		

        <script src="<?php echo base_url(); ?>js/vendor/jquery-1.8.3.min.js"></script>
		<script src="<?php echo base_url(); ?>js/jquery.backstretch.min.js"></script>
		
		<script>
 
			$.backstretch("<?php echo base_url(); ?>img/green.jpg");
		</script>
		
			<script src="<?php echo base_url(); ?>js/bootstrap-datetimepicker.min.js"></script>
			<script src="<?php echo base_url(); ?>js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>
	   
			
		   
			<script src="<?php echo base_url(); ?>js/vendor/jquery.ba-bbq.js"></script>
			<script src="<?php echo base_url(); ?>js/vendor/jstorage.js"></script>
			<script src="<?php echo base_url(); ?>js/vendor/bootstrap.min.js"></script>
			<script src="<?php echo base_url(); ?>js/bootstrap-datepicker.js"></script>
			<script src="<?php echo base_url(); ?>js/main.js"></script>
		
		<script type="text/javascript">
		  $('#datetimepicker').datetimepicker({
			format: 'yyyy-MM-dd hh:mm:ss',
			language: 'en'
		  });
		</script>
		<script type="text/javascript">
		  $('#datetimepicker2').datetimepicker({
			format: 'yyyy-MM-dd hh:mm:ss',
			language: 'en'
		  });
		</script>
			
    </body>
</html>
