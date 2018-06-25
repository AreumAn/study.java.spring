<body>

	<div class="container-fluid">
		<!-- Slider -->
		<div class="tp-banner-container">
			<div class="tp-banner">
				<ul>
					<!-- SLIDE  -->
					<li data-transition="fade" data-slotamount="7"
						data-masterspeed="1500">
						<!-- MAIN IMAGE --> <img src="/resources/images/slide.jpg"
						alt="slidebg1" data-bgfit="cover" data-bgposition="left top"
						data-bgrepeat="no-repeat"> <!-- LAYERS -->
					</li>
				</ul>
			</div>
		</div>
		<!-- //Slider -->

		<div class="headernav">
			<div class="container">
				<div class="row">
					<div class="col-lg-1 col-xs-3 col-sm-2 col-md-2 logo ">
						<a href="index.html"> <img src="/resources/images/logo.jpg"
							alt="" />
						</a>
					</div>
					<div class="col-lg-4 search hidden-xs hidden-sm col-md-3">
						<div class="wrap">
							<form action="#" method="post" class="form">
								<div class="pull-left txt">
									<input type="text" class="form-control"
										placeholder="Search Topics">
								</div>
								<div class="pull-right">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>
								</div>
								<div class="clearfix"></div>
							</form>
						</div>
					</div>
					<div class="col-lg-3 col-xs-9 col-sm-5 col-md-3 selecttopic">
						<div class="dropdown">
							<a data-toggle="dropdown" href="#">SORT BY</a> <b class="caret"></b>
							<ul class="dropdown-menu" role="menu">
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#">Title(A-Z)</a></li>
								<li role="presentation"><a role="menuitem" tabindex="-2"
									href="#">Title(Z-A)</a></li>
								<li role="presentation"><a role="menuitem" tabindex="-3"
									href="#">Latest date</a></li>

							</ul>
						</div>
					</div>
					<div class="col-lg-4 col-xs-12 col-sm-5 col-md-4 avt">
						<div class="stnt pull-left">
							<form action="/topic/write" class="form">
								<button class="btn btn-primary">Start New Topic</button>
							</form>
						</div>
						<div class="env pull-left">
							<i class="fa fa-envelope"></i>
						</div>

						<div class="avatar pull-left dropdown">
							<a data-toggle="dropdown" href="#"> <img
								src="/resources/images/avatar.jpg" alt="" />
							</a> <b class="caret"></b>
							<div class="status green">&nbsp;</div>
							<ul class="dropdown-menu" role="menu">
								<c:choose>
									<c:when test="${login}">
										<li role="presentation"><a role="menuitem" tabindex="-3"
											href="/user/logout">Log Out</a></li>
									</c:when>
									<c:otherwise>
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="/user/login">Log In</a></li>

										<li role="presentation"><a role="menuitem" tabindex="-4"
											href="/user/create">Create account</a></li>
									</c:otherwise>
								</c:choose>
							</ul>
						</div>

						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>