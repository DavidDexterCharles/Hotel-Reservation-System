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
        
		<link type="text/css" rel="stylesheet" media="all" href="<?php echo base_url(); ?>css/skitter.styles.css" >
		<script src="<?php echo base_url(); ?>js/vendor/jquery-1.8.3.min.js"></script>
		<script src="<?php echo base_url(); ?>js/jquery.easing.1.3.js"></script>
		<script src="<?php echo base_url(); ?>js/jquery.animate-colors-min.js"></script>
		<script src="<?php echo base_url(); ?>js/jquery.skitter.min.js"></script>
		<link rel="stylesheet" href="<?php echo base_url(); ?>css/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="<?php echo base_url(); ?>css/main.css">
		<link rel="stylesheet" href="<?php echo base_url(); ?>css/bootstrap-datetimepicker.min.css">
		
		<script type="text/javascript">
				$(document).ready(function() {
					$('.box_skitter_large').skitter({
						theme: 'default',
						dots: true, 
						preview: true,
						numbers_align: 'center'
					});
				});
		</script>
		
    
  </head>

	
 <body>	
		<div class="container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 panel panel-default">
	
						<div class="box_skitter box_skitter_large">
												<ul>
													<li>
														<a href="#cut"><img src="<?php echo base_url(); ?>img/home/pic1.jpg" class="cut" /></a>
														<div class="label_text"><p>Book Your Next Vacation!</p></div>
													</li>
													<li>
														<a href="#swapBlocks"><img src="<?php echo base_url(); ?>img/home/pic2.jpg" class="swapBlocks" /></a>
														<div class="label_text"><p>The Ultimate Getaway</p></div>
													</li>
													<li>
														<a href="#swapBarsBack"><img src="<?php echo base_url(); ?>img/home/pic3.jpg" class="swapBarsBack" /></a>
														<div class="label_text"><p>Benefit from our special deals!</p></div>
													</li>
												</ul>
						</div>
				</div>
			</div>								
		</div>								
						
						<br/>
						<br/>
						<br/>				
		<div class="container">
							
			<div class="row">
				<div class="col-md-8 col-md-offset-2 panel panel-default">				
				
						
				
						<br/>
						<br/>
						
						
					
						<h3> Book Your Room Today! </h3>	
						<p>Enjoy the holiday of your dreams with friends and family.The Hotel is the address for unparalleled luxury and fun . Benefit from our special offers , some which capture the warmth and essence
							of a special season and some which give you a little something extra any time of the year.
						</p>
						
						<br/>
						<br/>
						<?php  if(!$this->session->userdata('loggedin')){?>
							<p>
							  <a class="btn btn-large btn-primary" type="button" href = "<?php echo base_url(); ?>index.php/sections/login">Log In to Make A Reservation!</button></a>
							  
							</p>
						<?php } else{  ?>
							<p>
							  <a class="btn btn-large btn-primary" type="button" href = "<?php echo base_url(); ?>index.php/sections/reservation">Make A Reservation!</button></a>
							  
							</p>
						<?php } ?>
				</div>	
			</div>
		</div>
		
			
			
			
			
			
			
			
			
			
			<script src="<?php echo base_url(); ?>js/jquery.backstretch.min.js"></script>
		
			<script src="<?php echo base_url(); ?>js/bootstrap-datetimepicker.min.js"></script>
			<script src="<?php echo base_url(); ?>js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>
			<script src="<?php echo base_url(); ?>js/vendor/jquery.ba-bbq.js"></script>
			<script src="<?php echo base_url(); ?>js/vendor/jstorage.js"></script>
			<script src="<?php echo base_url(); ?>js/vendor/bootstrap.min.js"></script>
			<script src="<?php echo base_url(); ?>js/bootstrap-datepicker.js"></script>
			<script src="<?php echo base_url(); ?>js/main.js"></script>
       
    </body>
</html>
