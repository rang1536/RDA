$(document).ready(function() {
	// Store variables
	var accordion_head = $('.accordion > li > a'), accordion_body = $('.accordion li > .sub_menu');
	
	// Open the first tab on load
	accordion_body.hide();
	
	// Click function
	accordion_head.on('click', function(event) {
	
		// Disable header links
		event.preventDefault();
	
		// Show and hide the tabs on click
		if ($(this).attr('class') != 'active') {
			accordion_body.slideUp('normal');
			$(this).next().stop(true, true).slideToggle(
					'normal');
			accordion_head.removeClass('active');
			$(this).addClass('active');
		}
	});
});