<%@ include file="./include/header.jsp"%>
<%@ include file="./include/navigation.jsp"%>
<section class="content">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-xs-12 col-md-8">
				<div class="empty-h-20px"></div>
			</div>
		</div>
	</div>


	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12">

				<!-- POST -->
				<div class="post">
					<form action="#" class="form newtopic" method="post">
						<div class="postinfotop">
							<h2>Create New Account</h2>
						</div>

						<!-- acc section -->
						<div class="accsection">
							<div class="acccap">
								<div class="userinfo pull-left">&nbsp;</div>
								<div class="posttext pull-left">
									<h3>Required Fields</h3>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="topwrap">
								<div class="userinfo pull-left">
									<div class="avatar">
										<img src="/resources/images/avatar-blank.jpg" alt="" />
										<div class="status green">&nbsp;</div>
									</div>
									<div class="imgsize">60 x 60</div>
									<div>
										<button class="btn">Add</button>
									</div>
								</div>
								<div class="posttext pull-left">
									<div class="row">
										<div class="col-lg-6 col-md-6">
											<input type="text" placeholder="user ID" name="userID"
												class="form-control" />
										</div>
										<div class="col-lg-6 col-md-6">
											<input type="text" placeholder="Email" name="userEmail"
												class="form-control" />
										</div>
									</div>
									<div class="row">
										<div class="col-lg-6 col-md-6">
											<input type="text" placeholder="First Name" name="firstName"
												class="form-control" />
										</div>
										<div class="col-lg-6 col-md-6">
											<input type="text" placeholder="Last Name" name="lastName"
												class="form-control" />
										</div>
									</div>
									<div class="row">
										<div class="col-lg-6 col-md-6">
											<input type="password" placeholder="Password" name="userPW"
												class="form-control" id="pass" name="pass" />
										</div>
										<div class="col-lg-6 col-md-6">
											<input type="password" placeholder="Retype Password"
												class="form-control" id="pass2" name="pass2" />
										</div>
									</div>

								</div>
								<div class="clearfix"></div>
							</div>
						</div>
						<!-- acc section END -->



						<div class="postinfobot">

							<div class="notechbox pull-left">
								<input type="checkbox" name="note" id="note"
									class="form-control" />
							</div>

							<div class="pull-left lblfch">
								<label for="note"> I agree with the Terms and Conditions
									of this site</label>
							</div>

							<div class="pull-right postreply">
								<div class="pull-left smile">
									<a href="#"> <i class="fa fa-smile-o"></i>
									</a>
								</div>
								<div class="pull-left">
									<button type="submit" class="btn btn-primary">Sign Up</button>
								</div>
								<div class="clearfix"></div>
							</div>


							<div class="clearfix"></div>
						</div>
					</form>
				</div>
				<!-- POST -->






			</div>
		</div>
	</div>



	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-xs-12 col-md-8">
				<div class="empty-h-20px"></div>
			</div>
		</div>
	</div>

</section>
<%@ include file="./include/footer.jsp"%>