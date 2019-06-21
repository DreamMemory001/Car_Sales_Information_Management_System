/*
	Project Name : Carmax
	
	- Google Map
	
	## Document Scroll		

	## Document Ready
		- Scrolling Navigation
		- Find all anchors
		- Responsive Caret
		- Search
		- Revolution Slider
		- Portfolio Section
		- Blog Section
		- Instagram Carousel
		- Counter
		- Price Filter
		- Inventory Carousel
		- Contact Map
		- Quick Contact Form

	## Window Load
		- Site Loader
*/

(function($) {

	"use strict"
	
	/* - Google Map */
	function initialize(obj) {
		var lat = $('#'+obj).attr("data-lat");
        var lng = $('#'+obj).attr("data-lng");
		var contentString = $('#'+obj).attr("data-string");
		var myLatlng = new google.maps.LatLng(lat,lng);
		var map, marker, infowindow;
		var image = "images/marker.png";
		var zoomLevel = parseInt($('#'+obj).attr("data-zoom") ,10);		
		var styles = [{"featureType":"landscape","stylers":[{"saturation":-100},{"lightness":65},{"visibility":"on"}]},{"featureType":"poi","stylers":[{"saturation":-100},{"lightness":51},{"visibility":"simplified"}]},{"featureType":"road.highway","stylers":[{"saturation":-100},{"visibility":"simplified"}]},{"featureType":"road.arterial","stylers":[{"saturation":-100},{"lightness":30},{"visibility":"on"}]},{"featureType":"road.local","stylers":[{"saturation":-100},{"lightness":40},{"visibility":"on"}]},{"featureType":"transit","stylers":[{"saturation":-100},{"visibility":"simplified"}]},{"featureType":"administrative.province","stylers":[{"visibility":"off"}]},{"featureType":"water","elementType":"labels","stylers":[{"visibility":"on"},{"lightness":-25},{"saturation":-100}]},{"featureType":"water","elementType":"geometry","stylers":[{"hue":"#ffff00"},{"lightness":-25},{"saturation":-97}]}]
		var styledMap = new google.maps.StyledMapType(styles,{name: "Styled Map"});	
		
		var mapOptions = {
			zoom: zoomLevel,
			disableDefaultUI: true,
			center: myLatlng,
            scrollwheel: false,
			mapTypeControlOptions: {
            mapTypeIds: [google.maps.MapTypeId.ROADMAP, "map_style"]
			}
		}
		
		map = new google.maps.Map(document.getElementById(obj), mapOptions);	
		
		map.mapTypes.set("map_style", styledMap);
		map.setMapTypeId("map_style");
		
		infowindow = new google.maps.InfoWindow({
			content: contentString
		});      
	    
        marker = new google.maps.Marker({
			position: myLatlng,
			map: map,
			icon: image
		});

		google.maps.event.addListener(marker, "click", function() {
			infowindow.open(map,marker);
		});	
	}

	/* ## Document Scroll - Window Scroll */
	$( document ).on("scroll",function()
	{
		var scroll	=	$(window).scrollTop();
		var height	=	$(window).height();

		/*** set sticky menu ***/
		if( scroll >= height )
		{
			$(".header-section").addClass("navbar-fixed-top animated fadeInDown").delay( 2000 ).fadeIn();
		}
		else if ( scroll <= height )
		{
			$(".header-section").removeClass("navbar-fixed-top animated fadeInDown");
		}
		else
		{
			$(".header-section").removeClass("navbar-fixed-top animated fadeInDown");
		} // set sticky menu - end		

		if ($(this).scrollTop() >= 50)
		{
			/* If page is scrolled more than 50px */
			$("#back-to-top").fadeIn(200);    /* Fade in the arrow */
		}
		else
		{
			$("#back-to-top").fadeOut(200);   /* Else fade out the arrow */
		}
	});
		
	/* ## Document Ready - Handler for ready() called */
	$(document).on("ready",function() {

		/* - Scrolling Navigation */
		var scroll	=	$(window).scrollTop();
		var width	=	$(window).width();
		var height	=	$(window).height();
		
		/* ** set sticky menu ** */
		if( scroll >= height -500 )
		{
			$(".header-section").addClass("navbar-fixed-top").delay( 2000 ).fadeIn();
		}
		else if ( scroll <= height )
		{
			$(".header-section").removeClass("navbar-fixed-top");
		}
		else
		{
			$(".header-section").removeClass("navbar-fixed-top");
		} /* set sticky menu - end */
		
		
		$('.navbar-nav li a[href*="#"]:not([href="#"]), .site-logo a[href*="#"]:not([href="#"])').on("click", function(e) {
	
			var $anchor = $(this);
			
			$("html, body").stop().animate({ scrollTop: $($anchor.attr("href")).offset().top - 49 }, 1500, "easeInOutExpo");
			
			e.preventDefault();
		});

		/* - Responsive Caret */
		$(".ddl-switch").on("click", function() {
			var li = $(this).parent();
			if ( li.hasClass("ddl-active") || li.find(".ddl-active").length !== 0 || li.find(".dropdown-menu").is(":visible") ) {
				li.removeClass("ddl-active");
				li.children().find(".ddl-active").removeClass("ddl-active");
				li.children(".dropdown-menu").slideUp();
			}
			else {
				li.addClass("ddl-active");
				li.children(".dropdown-menu").slideDown();
			}
		});
		
		/* - Search */
		if($(".search-box").length){
			$("#search").on("click", function(){
				$(".search-box").addClass("active")
			});
			$(".search-box span").on("click", function(){
				$(".search-box").removeClass("active")
			});
		}
		
		/* - Revolution Slider */
		if($(".slider-section").length){
			$("#home-slider1").revolution({
				sliderType:"standard",
				sliderLayout:"auto",
				delay:6000,
				navigation: {
					arrows:{
						enable:true,
						style:"uranus"
					}
				},
				gridwidth:1900,
				gridheight:980 ,
			
			});
			$("#home-slider2").revolution({
				sliderType:"standard",
				sliderLayout:"auto",
				delay:6000,
				navigation: {
					arrows:{
						enable:true,
						style:"uranus"
					},
					bullets: {
						enable:true,
						hide_onmobile:true,
						hide_under:960,
						style:"zeus",
						hide_onleave:false,
						direction:"horizontal",
						h_align:"left",
						v_align:"bottom",
						h_offset:365,
						v_offset:97,
						space:10,
						tmp:''
					}
				},
				gridwidth:1900,
				gridheight:980 ,
			});
		}
		
		/* - Portfolio Section */
		if($(".portfolio-section").length){
			var url;
			$(".portfolio-section .portfolio-box .portfolio-content ul li").magnificPopup({
				delegate: "a.zoom",
				type: "image",
				tLoading: "Loading image #%curr%...",
				mainClass: "mfp-img-mobile",
				gallery: {
					enabled: true,
					navigateByImgClick: false,
					preload: [0,1] // Will preload 0 - before current, and 1 after the current image
				},
				image: {
					tError: "<a href="%url%">The image #%curr%</a> could not be loaded.",				
				}
			});
		}
		
		/* - Blog Section */
		if($(".latest-blog-section").length){
			var url;
			$(".latest-blog-section .entry-cover ul li").magnificPopup({
				delegate: "a.zoom",
				type: "image",
				tLoading: "Loading image #%curr%...",
				mainClass: "mfp-img-mobile",
				gallery: {
					enabled: true,
					navigateByImgClick: false,
					preload: [0,1] // Will preload 0 - before current, and 1 after the current image
				},
				image: {
					tError: "<a href="%url%">The image #%curr%</a> could not be loaded.",				
				}
			});
		}
		
		/* - Instagram Carousel */
		if($(".partner-carousel").length){
			$(".partner-carousel").owlCarousel({
				autoplay: true,
				loop: true,
				dots: false,
				nav: true,
				responsive:{
					0:{
						items:1
					},
					400:{
						items:2
					},
					500:{
						items:3
					},
					768:{
						items:4
					},
					1200:{
						items:5
					}
				},
				margin: 0,
				stagePadding: 0,
				smartSpeed: 450
			});
		}
		
		/* - Counter */
		if($(".counter-section").length) {
			$( "[id*='counter_section-']" ).each(function ()
			{
				var ele_id = 0;
				ele_id = $(this).attr('id').split("-")[1];
				
				var $this = $(this);
				var myVal = $(this).data("value");

				$this.appear(function()
				{		
					var statistics_item_count = 0;
					var statistics_count = 0;					
					statistics_item_count = $( "[id*='statistics_"+ ele_id +"_count-']" ).length;
					 
					for(var i=1; i<=statistics_item_count; i++)
					{
						statistics_count = $( "[id*='statistics_"+ ele_id +"_count-"+ i +"']" ).attr( "data-statistics_percent" );
						$("[id*='statistics_"+ ele_id +"_count-"+ i +"']").animateNumber({ number: statistics_count }, 4000);
					}				
				});
			});
		}
		
		/* - Price Filter */
		$( "#slider-range" ).slider({
			range: true,
			min: 1,
			max: 130000,
			values: [ 200, 130000 ],
			slide: function( event, ui ) {
				$( "#amount" ).html( "$" + ui.values[ 0 ] )
				$( "#amount2" ).html( "$" + ui.values[ 1 ] );
			}
		});
		$( "#amount" ).html( "$" + $( "#slider-range" ).slider( "values", 0 ) );
		$( "#amount2" ).html( " $" + $(  "#slider-range" ).slider( "values", 1 ) );
		
		/* - Inventory Carousel */
		if($("#imageGallery").length){
			$('#imageGallery').lightSlider({
				gallery:true,
				item: 1,
				thumbItem: 4,
				responsive : [
					{
						breakpoint:992,
						settings: {
							thumbItem: 4
						}
					},{
						breakpoint:991,
						settings: {
							thumbItem: 3
						}
					},{
						breakpoint:767,
						settings: {
							thumbItem: 4
						}
					},{
						breakpoint:560,
						settings: {
							thumbItem: 3
						}
					},{
						breakpoint:400,
						settings: {
							thumbItem: 2
						}
					}
				],
				slideMargin: 0,
				thumbMargin: 10,
				speed: 500,
				auto: false,
				loop: true,
				onSliderLoad: function() {
					$('#image-gallery').removeClass('cS-hidden');
				} 
			});
		}
		
		/* - Contact Map */
		if($("#map-canvas-contact").length==1){
			initialize("map-canvas-contact");
		}
		
		/* - Quick Contact Form */
		$( "#btn_submit" ).on( "click", function(event) {
			event.preventDefault();
			var mydata = $("form").serialize();
			$.ajax({
				type: "POST",
				dataType: "json",
				url: "contact.php",
				data: mydata,
				success: function(data) {
					if( data["type"] == "error" ){
						$("#alert-msg").html(data["msg"]);
						$("#alert-msg").removeClass("alert-msg-success");
						$("#alert-msg").addClass("alert-msg-failure");
						$("#alert-msg").show();
					} else {
						$("#alert-msg").html(data["msg"]);
						$("#alert-msg").addClass("alert-msg-success");
						$("#alert-msg").removeClass("alert-msg-failure");					
						$("#input_fname").val("");
						$("#input_lname").val("");
						$("#input_email").val("");
						$("#input_phone").val("");
						$("#textarea_message").val("");
						$("#alert-msg").show();
					}
				},
				error: function(xhr, textStatus, errorThrown) {
					//alert(textStatus);
				}
			});
			return false;
		});/* Quick Contact Form /- */
		
	});	/* - Document Ready /- */
	
	/* ## Window Load - Handler for load() called */	
	$(window).on("load",function() {
		/* - Site Loader */
		if ( !$("html").is(".ie6, .ie7, .ie8") ) {
			$("#site-loader").delay(1000).fadeOut("slow");
		}
		else {
			$("#site-loader").css("display","none");
		}
		
		/* - Portfolio Section */
		var $container = $(".portfolio-section");
		$container.isotope({
			itemSelector: ".portfolio-box",
			gutter: 0,
			transitionDuration: "0.5s"
		});
		
		/* $("#filters a").on("click",function(){
			$('#filters a').removeClass("active");
			$(this).addClass("active");
			var selector = $(this).attr("data-filter");
			$container.isotope({ filter: selector });		
			return false;
		}); */
		
	});

})(jQuery);