
<%@page import="com.clean.bin.helper.ConnectionProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clean_Bin | Home</title>

<!-- css -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link rel="stylesheet" href="css/mystyle.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
.banner-background {
	clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 91%, 63% 100%, 22% 91%, 0 99%, 0 0);
}
</style>
</head>
<body>

	<!-- navbar -->
	<%@include file="normal_navbar.jsp"%>


<!-- 	<div class="container-fluid p-0 m-0"> -->
<!-- 		<div class="jumbotron primary-background text-white banner-background"> -->
<!-- 			<div class=" container"> -->
<!-- 				<h3 class="display-3">Welcome to Tech Blog</h3> -->
<!-- 				<p>Welcome to Technical Blog, world of technology A programming -->
<!-- 					language is any set of rules that converts strings, or graphical -->
<!-- 					program elements in the case of visual programming languages, to -->
<!-- 					various kinds of machine code output.[citation needed] Programming -->
<!-- 					languages are one kind of computer language, and are used in -->
<!-- 					computer programming to implement algorithms.</p> -->
<!-- 				<p>Most programming languages consist of instructions for -->
<!-- 					computers. There are programmable machines that use a set of -->
<!-- 					specific instructions, rather than general programming languages. -->
<!-- 					Since the early 1800s, programs have been used to direct the -->
<!-- 					behavior of machines such as Jacquard looms, music boxes and player -->
<!-- 					pianos.[1]</p> -->

<!-- 				<button class="btn btn-outline-light btn-lg"> -->
<!-- 					<span class="fa fa-user-plus"></span> Start ! its Free -->
<!-- 				</button> -->
<!-- 				<a href="login_page.jsp" class="btn btn-outline-light btn-lg"> <span -->
<!-- 					class="fa fa-user-circle fa-spin"></span> Login -->
<!-- 				</a> -->
<!-- 			</div> -->
<!-- 		</div> -->

<!-- 	</div> -->


<!-- 	<!-- 	cards --> 

<!-- 	<div class="container"> -->

<!-- 		<div class="row mb-2"> -->
<!-- 			<div class="col-md-4"> -->
<!-- 				<div class="card"> -->
<!-- 					<div class="card-body"> -->
<!-- 						<h5 class="card-title">Java Programming</h5> -->
<!-- 						<p class="card-text">Some quick example text to build on the -->
<!-- 							card title and make up the bulk of the card's content.</p> -->
<!-- 						<a href="#" class="btn btn-primary primary-background text-light">Read -->
<!-- 							More</a> -->
<!-- 					</div> -->
<!-- 				</div> -->



<!-- 			</div> -->
<!-- 			<div class="col-md-4"> -->
<!-- 				<div class="card"> -->
<!-- 					<div class="card-body"> -->
<!-- 						<h5 class="card-title">Java Programming</h5> -->
<!-- 						<p class="card-text">Some quick example text to build on the -->
<!-- 							card title and make up the bulk of the card's content.</p> -->
<!-- 						<a href="#" class="btn btn-primary primary-background text-light">Read -->
<!-- 							More</a> -->
<!-- 					</div> -->
<!-- 				</div> -->



<!-- 			</div> -->

<!-- 			<div class="col-md-4"> -->
<!-- 				<div class="card"> -->
<!-- 					<div class="card-body"> -->
<!-- 						<h5 class="card-title">Java Programming</h5> -->
<!-- 						<p class="card-text">Some quick example text to build on the -->
<!-- 							card title and make up the bulk of the card's content.</p> -->
<!-- 						<a href="#" class="btn btn-primary primary-background text-light">Read -->
<!-- 							More</a> -->
<!-- 					</div> -->
<!-- 				</div> -->


<!-- 			</div> -->



<!-- 		</div> -->

<!-- 		<div class="row"> -->
<!-- 			<div class="col-md-4"> -->
<!-- 				<div class="card"> -->
<!-- 					<div class="card-body"> -->
<!-- 						<h5 class="card-title">Java Programming</h5> -->
<!-- 						<p class="card-text">Some quick example text to build on the -->
<!-- 							card title and make up the bulk of the card's content.</p> -->
<!-- 						<a href="#" class="btn btn-primary primary-background text-light">Read -->
<!-- 							More</a> -->
<!-- 					</div> -->
<!-- 				</div> -->



<!-- 			</div> -->
<!-- 			<div class="col-md-4"> -->
<!-- 				<div class="card"> -->
<!-- 					<div class="card-body"> -->
<!-- 						<h5 class="card-title">Java Programming</h5> -->
<!-- 						<p class="card-text">Some quick example text to build on the -->
<!-- 							card title and make up the bulk of the card's content.</p> -->
<!-- 						<a href="#" class="btn btn-primary primary-background text-light">Read -->
<!-- 							More</a> -->
<!-- 					</div> -->
<!-- 				</div> -->



<!-- 			</div> -->

<!-- 			<div class="col-md-4"> -->
<!-- 				<div class="card"> -->
<!-- 					<div class="card-body"> -->
<!-- 						<h5 class="card-title">Java Programming</h5> -->
<!-- 						<p class="card-text">Some quick example text to build on the -->
<!-- 							card title and make up the bulk of the card's content.</p> -->
<!-- 						<a href="#" class="btn btn-primary primary-background text-light">Read -->
<!-- 							More</a> -->
<!-- 					</div> -->
<!-- 				</div> -->


<!-- 			</div> -->



<!-- 		</div> -->

<!-- 	</div> -->

<div class="container-fluid p-0 m-0">
		<div class="jumbotron primary-background text-white banner-background">
			<div class=" container">
				<h3 class="display-3">CLEAN_BIN</h3>
				<p>
					<ul>
					 So basically this website act as a connecting link between a waste generator and waste management industry. <br>
					The waste generator mentioned above are the target sites from the waste have not been collected. <br>
					Through our website you can inform the responsible person for collecting the waste from the target site <br>
					By this process you can help the in cleaning of waste as an responsible citizen of country.
				</ul></p>
				<p><b>How does the process work ???</b> <br>
					You are not required to do any lengthy process. You have to just contact to the responsible person through our website and inform him about the target location.
					</p>

				 <center>
				<a href="login_page.jsp" class="btn btn-outline-light btn-lg"> <span
					class="fa fa-user-circle fa-spin"></span> Login
				</a>
				<a href="register_page.jsp" class="btn btn-outline-light btn-lg"> <span
					class="fa fa-user-circle fa-spin"></span> Register
				</a>`
				</center>
			</div>
		</div>

	</div>

<!--  -->
		<!-- cards -->
<!--  -->
	
<div class="container">

		<div class="row mb-2">
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">E-DUSTBINS</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						
					</div>
				</div>



			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">COMMERCIAL ESTABLISHMENT</h5>
						<p class="card-text">The output of the service will help to save time and labour.</p>
						
					</div>
				</div>



			</div>

			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">DYNAMIC ROUTING</h5>
						<p class="card-text">The solution optimizes waste collection routes and schedules based on real-time and
							historical data, provides predictive analytics to enable decision making ahead of time,
							and offers consultation on waste bin allocations.</p>
						
					</div>
				</div>


			</div>



		</div>

		<div class="row">
			<div class="col-md-4">
				<div class="card">
					
				</div>



			</div>


			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Do you have a waste problem?</h5>
						<p class="card-text">BECAUSE WE
							offers a comprehensive smart waste management solution using industry leading
							cloud-based software connected to the latest IoT smart sensor and smart bin
							technology from our smart solution (KADAM)</p>
						
					</div>
				</div>



			</div>

			<div class="row">
				<div class="col-md-4">
					<div class="card">
						
					</div>
	
	
	
				</div>

			


			</div>



		</div>

	</div>
<br>
<br>



	<!--javascript -->

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"
		integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

	<script src="js/myjs.js"></script>

</body>

</html>