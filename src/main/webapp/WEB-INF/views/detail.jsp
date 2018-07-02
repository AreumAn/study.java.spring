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
		<div class="col-lg-8 col-md-8">

			<!-- POST -->
			<div class="post beforepagination">
				<div class="topwrap">
					<div class="userinfo pull-left">
						<div class="avatar">
							<img src="images/avatar.jpg" alt="" />
						</div>
					</div>
					<div class="posttext pull-left">
						<h2>${topic.title}</h2>
						<p>${topic.description}</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="postinfobot">

					<div class="likeblock pull-left">
						<a href="#" class="up"> <i class="fa fa-thumbs-o-up"></i>25
						</a> <a href="#" class="down"> <i class="fa fa-thumbs-o-down"></i>3
						</a>
					</div>

					<div class="prev pull-left">
						<a href="#"> <i class="fa fa-reply"></i>
						</a>
					</div>

					<div class="posted pull-left">
						<i class="fa fa-clock-o"></i> ${topic.modifyDate}
					</div>

					<div class="clearfix"></div>
				</div>
			</div>
			<!-- POST -->

			<hr class="hr-detail-page">

			<!-- POST -->
			<div class="post">
				<div class="topwrap">
					<div class="userinfo pull-left">
						<div class="avatar">
							<img src="images/avatar2.jpg" alt="" />
						</div>
					</div>
					<div class="posttext pull-left">
						<p>Typography helps you engage your audience and establish a
							distinct, unique personality on your website. Knowing how to use
							fonts to build character in your design is a powerful skill, and
							exploring the history and use of typefaces, as well as typogra...</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="postinfobot">

					<div class="likeblock pull-left">
						<a href="#" class="up"> <i class="fa fa-thumbs-o-up"></i>10
						</a> <a href="#" class="down"> <i class="fa fa-thumbs-o-down"></i>1
						</a>
					</div>

					<div class="prev pull-left">
						<a href="#"> <i class="fa fa-reply"></i>
						</a>
					</div>

					<div class="posted pull-left">
						<i class="fa fa-clock-o"></i> Posted on : 20 Nov @ 9:45am
					</div>

					<div class="clearfix"></div>
				</div>
			</div>
			<!-- POST -->

			<!-- POST -->
			<div class="post">
				<div class="topwrap">
					<div class="userinfo pull-left">
						<div class="avatar">
							<img src="images/avatar3.jpg" alt="" />
						</div>
					</div>
					<div class="posttext pull-left">

						<blockquote>
							<span class="original">Original Posted by - theguy_21:</span> Did
							you see that Dove ad pop up in your Facebook feed this year? How
							about the Geico camel one?
						</blockquote>
						<p>Toronto Mayor Rob Ford does not have a bigger fan than
							"Anchorman's" Ron Burgundy. In fact, Burgundy wants Ford to be
							re-elected so much, that he agreed to sing the campaign song
							Brien. The tune in question ...</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="postinfobot">

					<div class="likeblock pull-left">
						<a href="#" class="up"> <i class="fa fa-thumbs-o-up"></i>55
						</a> <a href="#" class="down"> <i class="fa fa-thumbs-o-down"></i>12
						</a>
					</div>

					<div class="prev pull-left">
						<a href="#"> <i class="fa fa-reply"></i>
						</a>
					</div>

					<div class="posted pull-left">
						<i class="fa fa-clock-o"></i> Posted on : 20 Nov @ 9:50am
					</div>

					<div class="clearfix"></div>
					<!-- Reply -->
					<div class="post">
						<form action="#" class="form" method="post">
							<div class="topwrap">

								<div class="posttext replytext">
									<div class="textwraper">
										<div class="postreply">Post a Reply</div>
										<textarea name="reply" id="reply"
											placeholder="Type your message here"></textarea>
									</div>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="postinfobot">

								<div class="notechbox pull-left">
									<input type="checkbox" name="note" id="note"
										class="form-control" />
								</div>

								<div class="pull-left">
									<label for="note"> Email me when some one post a reply</label>
								</div>

								<div class="pull-right postreply">
									<div class="pull-left smile">
										<a href="#"> <i class="fa fa-smile-o"></i>
										</a>
									</div>
									<div class="pull-left">
										<button type="submit" class="btn btn-primary">Post
											Reply</button>
									</div>
									<div class="clearfix"></div>
								</div>
								<div class="clearfix"></div>
							</div>
						</form>
					</div>
					<!-- Reply -->
				</div>
			</div>
			<!-- POST -->



			<!-- POST -->
			<div class="post">
				<form action="#" class="form" method="post">
					<div class="topwrap">

						<div class="posttext replytext">
							<div class="textwraper">
								<div class="postreply">Post a Reply</div>
								<textarea name="reply" id="reply"
									placeholder="Type your message here"></textarea>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="postinfobot">

						<div class="notechbox pull-left">
							<input type="checkbox" name="note" id="note" class="form-control" />
						</div>

						<div class="pull-left">
							<label for="note"> Email me when some one post a reply</label>
						</div>

						<div class="pull-right postreply">
							<div class="pull-left smile">
								<a href="#"> <i class="fa fa-smile-o"></i>
								</a>
							</div>
							<div class="pull-left">
								<button type="submit" class="btn btn-primary">Post
									Reply</button>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="clearfix"></div>
					</div>
				</form>
			</div>
			<!-- POST -->


		</div>
		<%@ include file="./include/sidebar.jsp"%>
	</div>
</div>


</section>

<%@ include file="./include/footer.jsp"%>