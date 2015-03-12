(function (window){
  'use strict'; 
    var $ = window.jQuery,
        console = window.console,
        cache, operations, 
        GRYPHON;
    
    cache = {
        "" : $('.default')
    };
		
	var handleAddSiteForm = function() {
		var options = {};
		
		options.url = "http://localhost/proj/index.php/sections/siteInfo";
		
		options.success = function(data){
		
			$('.item').html(data);
			var form = $('#formid1');
			if (form.length > 0){
				form.submit(function(){
					console.log("Attempting to Submit");
					
					var options = {
						url: "http://localhost/proj/index.php/site/addSiteInfo",
						type: "POST",
						data: {
							"date": $('#date').val(),
							"category": $('#category').val(),
							"location": $('#locaton').val(), 
							"siteName": $('#siteName').val(),
							"coordinator": $('#coordinator').val(), 
							"numWorkers": $('#numWorkers').val(),
							"numBags": $('#numBags').val(),
							"weight": $('#weight').val(), 
						},
						success:function(){
							console.log("Data Was Stored");
						},
						error: function(re, status, error){
							console.log(re);
							console.log(status);
							console.log(error);
						}
					}
					$.ajax(options);
										
					return false;
				});
			}
		}
		
		options.type = "GET";
		
		$.ajax(options);
		
		
	}
	
	
	
	
	var handleAddMaterialsForm = function() {
		var options2 = {};
		
		options2.url = "http://localhost/proj/index.php/sectioms/materialsInfo";
		
		options2.success = function(data){
		
			$('.item').html(data);
			var form = $('#formid2');
			if (form.length > 0){
				form.submit(function(){
					console.log("Attempting to Submit");
					
					var options2 = {
						url: "http://localhost/proj/index.php/site/addMaterialsInfo",
						type: "POST",
						data: {
							"plastics": $('#plastics').val(),
							"paper": $('#paper').val(),
							"textiles": $('#textiles').val(),
							"rubber": $('#rubber').val(), 
							"metals": $('#metals').val(),
							"other": $('#other').val(),
							
						},
						success:function(){
							console.log("Data Was Stored");
						},
						error: function(re, status, error){
							console.log(re);
							console.log(status);
							console.log(error);
						}
					}
					$.ajax(options2);
										
					return false;
				});
			}
		}
		
		options2.type = "GET";
		
		$.ajax(options2);
		
		
	} 
    
   
	 

	 var handleSignupForm = function() {
		var options3 = {};
		
		options3.url = "http://localhost/proj/index.php/sections/signup";
		
		options3.success = function(data){
		
			$('.item').html(data);
			var form = $('#formid2');
			if (form.length > 0){
				form.submit(function(){
					console.log("Attempting to Submit");
					
					var options2 = {
						url: "http://localhost/proj/index.php/site/addUser",
						type: "POST",
						data: {
							"username": $('#username').val(),
							"password": $('#password').val(),
							"email": $('#email').val(),
							
							
						},
						success:function(){
							console.log("Data Was Stored");
						},
						error: function(re, status, error){
							console.log(re);
							console.log(status);
							console.log(error);
						}
					}
					$.ajax(options3);
										
					return false;
				});
			}
		}
		
		options3.type = "GET";
		
		$.ajax(options3);
		
		
	} 
    
        
    
	 
	 
	 function handleHome () {
        
    }
	
	 function handleStatistics() {
        
    }
	
	 function handleAbout() {
        
    }
	
	 function handleContact() {
        
    }
	
	
	 function handleLogout() {
        
    }

   operations = {
         
		""      		: handleHome, 
		"siteInfo"      : handleAddSiteForm,
		"materials" 	: handleAddMaterialsForm,
		"statistics"    : handleStatistics, 
		"about"      	: handleAbout, 
		"contact"      	: handleContact,
		"logout" 		: handleLogout
    };
    
	
	
	
  
       function setUp(){
        var url = $.param.fragment(); 
          console.log(url);
          url = url.toLowerCase();
          $( 'li.active' ).removeClass( 'active' );         
          $( 'a[href="#' + url + '"]' ).parent().addClass( 'active' );    
          $( '.content' ).children( ':visible' ).hide();
          if (cache[url]){ 
			cache[url].show();
			operations[url].call(window);
			} 
          else{
              $('.loading').show();
              cache[ url ] = $( '<div class="item"/>' )
                                .appendTo( '.content' )
                                .load( "sections/" + url + ".html", function(){ 
                                    $('.loading').hide();
                                    if (operations[url]){ operations[url].call(window); } 
                                });      
          }          
    }
    
    function buildGRYPHON (GRYPHON) {
        
    }
    
    
    
    
    $(window.document).ready(function (){   
		GRYPHON = window.GRYPHON;
        $(window).bind('hashchange',setUp); 
        setUp();
    });
    
    
    
}(this));
