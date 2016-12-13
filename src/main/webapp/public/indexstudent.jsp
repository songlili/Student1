<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<!-- start: Meta -->
	<meta charset="utf-8">
	<title>Bootstrap Metro Dashboard by Dennis Ji for ARM demo</title>
	<meta name="description" content="Bootstrap Metro Dashboard">
	<meta name="author" content="Dennis Ji">
	<meta name="keyword" content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
	<!-- end: Meta -->
	
	<!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- end: Mobile Specific -->
	
	<!-- start: CSS -->
	<link id="bootstrap-style" href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
	<link href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css" rel="stylesheet">
	<link id="base-style" href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet">
	<link id="base-style-responsive" href="<%=request.getContextPath()%>/css/style-responsive.css" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
	<!-- end: CSS -->
	

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	  	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<link id="ie-style" href="<%=request.getContextPath()%>/css/ie.css" rel="stylesheet">
	<![endif]-->
	
	<!--[if IE 9]>
		<link id="ie9style" href="<%=request.getContextPath()%>/css/ie9.css" rel="stylesheet">
	<![endif]-->
		
	<!-- start: Favicon -->
	<link rel="shortcut icon" href="<%=request.getContextPath()%>/img/favicon.ico">
	<!-- end: Favicon -->
	
		
		
		
</head>

<body>
		<!-- start: Header -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<a class="brand" href="index.jsp"><span>Metro</span></a>
								
				<!-- start: Header Menu -->
				<div class="nav-no-collapse header-nav">
					<ul class="nav pull-right">
						
						
						<!-- start: User Dropdown -->
						<li class="dropdown">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="halflings-icon white user"></i> ${sessionScope.login.name}
								<span class="caret"></span>
							</a>
							<ul class="dropdown-menu">
								<li class="dropdown-menu-title">
 									<span>Account Settings</span>
								</li>
								<li><a href="#"><i class="halflings-icon user"></i> Profile</a></li>
								<li><a href="<%=request.getContextPath()%>/student/login.html"><i class="halflings-icon off"></i> Logout</a></li>
							</ul>
						</li>
						<!-- end: User Dropdown -->
					</ul>
				</div>
				<!-- end: Header Menu -->
				
			</div>
		</div>
	</div>
	<!-- start: Header -->
	
		<div class="container-fluid-full">
		<div class="row-fluid">
				
			<!-- start: Main Menu -->
			<div id="sidebar-left" class="span2">
				<div class="nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						<li><a href="<%=request.getContextPath()%>/student/index.jsp"><i class="icon-bar-chart"></i><span class="hidden-tablet"> 主页</span></a></li>
						<li><a href="<%=request.getContextPath()%>/viewstudent/student/list"><i class="icon-list-alt"></i><span class="hidden-tablet"> 学生</span></a></li>
						<li><a href="<%=request.getContextPath()%>/viewstudent/subject/list"><i class="icon-align-justify"></i><span class="hidden-tablet"> 课程</span></a></li>
						<li><a href="<%=request.getContextPath()%>/viewstudent/qsas/list"><i class="icon-picture"></i><span class="hidden-tablet"> 反馈与解答</span></a></li>

					</ul>
				</div>
			</div>
			<!-- end: Main Menu -->

			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>

			<rapid:block name="content">content</rapid:block>


	<div class="modal hide fade" id="myModal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">×</button>
			<h3>Settings</h3>
		</div>
		<div class="modal-body">
			<p>Here settings can be configured...</p>
		</div>
		<div class="modal-footer">

		</div>
	</div>
	
	<div class="clearfix"></div>
	
	<footer>

		<p>
			<span style="text-align:left;float:left">&copy; 2016 </span>
			
		</p>

	</footer>
	
	<!-- start: JavaScript-->

		<script src="<%=request.getContextPath()%>/js/jquery-1.9.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery-migrate-1.0.0.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery-ui-1.10.0.custom.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.ui.touch-punch.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/modernizr.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.cookie.js"></script>
	
		<script src='<%=request.getContextPath()%>/js/fullcalendar.min.js'></script>
	
		<script src='<%=request.getContextPath()%>/js/jquery.dataTables.min.js'></script>

		<script src="<%=request.getContextPath()%>/js/excanvas.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.flot.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.flot.pie.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.flot.stack.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.flot.resize.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.chosen.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.uniform.min.js"></script>
		
		<script src="<%=request.getContextPath()%>/js/jquery.cleditor.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.noty.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.elfinder.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.raty.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.iphone.toggle.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.uploadify-3.1.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.gritter.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.imagesloaded.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.masonry.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.knob.modified.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/jquery.sparkline.min.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/counter.js"></script>
	
		<script src="<%=request.getContextPath()%>/js/retina.js"></script>

		<script src="<%=request.getContextPath()%>/js/custom.js"></script>
	<!-- end: JavaScript-->
	
</body>
</html>
