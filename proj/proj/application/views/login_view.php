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
			   
					<h3>Please Login </h3>
						<form id="formid1" class="form-horizontal" method="post" action="<?php echo base_url(); ?>index.php/authenticateUser/authenticate_user">
							 
								<div class="control-group">
									<label class="control-label" for="username">Username</label>
									<div class="controls">
										<input type="text" id="username" name ="username">
									</div>
								</div>
								
								
								
								<div class="control-group">
									<label class="control-label" for="password">Password</label>
									<div class="controls">
										<input type="password" id="password" name ="password">
									</div>
								</div>
							 <br/>
							 <div class="control-group">
									<div class="controls">
									<button type="submit" class="btn">Login</button>
									</div>
							</div>
						
							 <?php echo validation_errors('<p class = "text-error">'); ?>
						
							<p>If you do not have an existing account, you can create one by clicking <a href="<?php echo base_url(); ?>index.php/sections/signup"> here. </a>
					
					
					
						</form>
				</div>
					
		</div>
	</div>
									
	
	
	
	<div class="loading" style="display:none;">
      		<img src="<?php echo base_url(); ?>img/loading.gif" alt="Loading"/> 
    	</div>
		<script src="<?php echo base_url(); ?>js/vendor/jquery-1.8.2.min.js"></script>
		<script src="<?php echo base_url(); ?>js/vendor/jquery.ba-bbq.js"></script>
		<script src="<?php echo base_url(); ?>js/vendor/jstorage.js"></script>
        <script src="<?php echo base_url(); ?>js/vendor/bootstrap.min.js"></script>
		<script src="<?php echo base_url(); ?>js/main.js"></script>
   
   
   
   </body>
   
   
   
</html>