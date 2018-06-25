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
				<c:forEach items="${topiclist}" var="topic">
					<!-- POST -->
					<div class="post">
						<div class="wrap-ut pull-left">
							<div class="userinfo pull-left">
								<div class="avatar">
									<img src="images/avatar.jpg" alt="" />
								</div>
								<div class="icons"></div>
							</div>
							<div class="posttext pull-left">
								<!-- 제목 -->
								<h2>
									<a href="details.html">${topic.title}</a>
								</h2>
								<!-- 내용 앞에 100자 -->
								<p>${topic.description}</p>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="postinfo pull-left">
							<!-- 코멘트 수 -->
							<div class="comments">
								<div class="commentbg">
									10
									<div class="mark"></div>
								</div>
							</div>
							<!-- 조회수 -->
							<div class="views">
								<i class="fa fa-eye"></i> ${topic.hit}
							</div>
							<!-- 업로드날짜 -->
							<div class="time">
								<i class="fa fa-clock-o"></i> ${topic.modifyDate}
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
					<!-- POST -->
				</c:forEach>





			</div>

			<%@ include file="./include/sidebar.jsp"%>

		</div>
	</div>



	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-xs-12">
				<div class="pull-left">
					<a href="#" class="prevnext"> <i class="fa fa-angle-left"></i>
					</a>
				</div>
				<div class="pull-left">
					<ul class="paginationforum">
						<li class="hidden-xs"><a href="#">1</a></li>
						<li class="hidden-xs"><a href="#">2</a></li>
						<li class="hidden-xs"><a href="#">3</a></li>
						<li class="hidden-xs"><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">6</a></li>
						<li><a href="#" class="active">7</a></li>
						<li><a href="#">8</a></li>
						<li class="hidden-xs"><a href="#">9</a></li>
						<li class="hidden-xs"><a href="#">10</a></li>
						<li class="hidden-xs hidden-md"><a href="#">11</a></li>
						<li class="hidden-xs hidden-md"><a href="#">12</a></li>
						<li class="hidden-xs hidden-sm hidden-md"><a href="#">13</a>
						</li>
						<li><a href="#">1586</a></li>
					</ul>
				</div>
				<div class="pull-left">
					<a href="#" class="prevnext last"> <i class="fa fa-angle-right"></i>
					</a>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>


</section>

<%@ include file="./include/footer.jsp"%>
