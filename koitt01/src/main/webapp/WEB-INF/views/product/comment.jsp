<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	<style>
		#cContent{width:1100px;}
		#commentList {width:1100px;}
		#commentList tr td{border-collapse:collapse;
			border:1px solid black;  height:30px;
		}
		
	
	</style>
	<script type="text/javascript">
	//html 페이지 모두 호출후에 jquery실행
	$(function(){
		getComment_List();
		
	});
	//댓글삭제
	function comment_delete(cId){
		$.ajax({
			type:'post',
			url:"./comment_delete", 
			data:{ cId:cId },
			success:function(data){
				if(data=="success"){
					alert("delete 성공");
					getComment_List(); 
				}
				
			},
			error:function(request,status,error){
				alert("실패 : "+error);
				
			}
			
		});
		
		
	}
	
	
	
		$(function(){
			getComment_List();
		
	});
		// 댓글 등록
	function comment_insert(cId){
		$.ajax({
			type:'post',
			url:"./comment_insert", 
			data:$("#topTable").serialize(),
			success:function(data){
				if(data=="success"){
					alert("insert 성공");
					getComment_List(); 
					$("#cContent").val("");
				}
				
			},
			error:function(request,status,error){
				alert("실패 : "+error);
				
			}
			
		});
		
		
	}
	
	
	
		// 댓글 리스트 출력
		function getComment_List(){
			$.ajax({
				type:'get',
				url:"./comment_List",
				dataType:"json",
				data:{   }, // bId:25  $(#commentForm).serialize,
				contentType:"application/json; charset=UTF-8",
				success:function(data){
					var html="";
					var Ccnt = data.length; // list개수를 확인할수 있음.
					$("#Ccnt").html(Ccnt);
					var bId = data[3].bId;
					
					if(data.length>0){
						
				 	for(var i=0; i<data.length;i++){
				 		html += "<tr><td colspan='2'><h5>bId :"+data[i].bId+"</h5></td></tr>";
						html += "<tr><td colspan='2'><h5>작성자 :"+data[i].cName +"</h5></td></tr>";
						html += "<tr><td id='updateForm'+"+data[i].cId +"''><td>내용 :"+data[i].cContent+"</td>";
						// updateForm0 updateFrom1, updateForm2,....
						
						html +="<td><a href='#' onclick='comment_updateForm("+data[i].cId+","+data[i].cContent+")'>수정</a>";
						html +="<a href='#' onclick='comment_delete("+data[i].cId+")'>삭제</a>";
						html +="</td></tr>"
						
					}
					}else{
						
						html += "<tr><td colspan='2'><h5>작성자 :작성자 :없음 </h5></td></tr>";
						html += "<tr><td>내용 :등록된 댓글 없슴</td>";
						
					} 
					
						
					
					$("#commentList").html(html);
					$("#bId").html("데이타 정보 : "+bId);
					
						
					
 				},
				error:function(request,status,error){
					alert("실패"+error);
				}
				
				
			});
			
		
		}
		//댓글수정 폼생성
// 		function comment_updateForm(cId,cContent){
			
// 			var html="<td>";
// 			html +="<input type='text' id='cContent' name='cContent' value='"+cContent+"' />";
// 			html +="<input type="hidden" id='cId',name='cId' value="">";
// 			html +="</td>";
// 			html +="</td></tr>";
			
			
// 		}
		
		
		
		

	</script>
	</head>
	<body>
	
	<form id="topTable" name="topTable" method="post" >
      <h3><span id="bId">데이타 정보 : ${param.bId }</span>
         댓글개수:<span id="Ccnt"></span>
      </h3>
      <table>
         <tr>
            <td>
            <textarea rows="3" cols="30" id="cContent" name="cContent"
                  placeholder="댓글을 입력해주세요." ></textarea> <br>	
                  <br>
             
                  <input type="hidden" name="bId" value="123">
                  <input type="hidden" name="cName" value="홍길동">
                  <button type="button" onclick="comment_insert()">등록</button>
                  <br><br>
                  <!-- 로그인 되어 있으면 그 로그인 된 사람의 이름을 넘겨줌. -->
            </td>
         </tr>

      </table>
   </form>
	
	
		<form id="commentListForm" name="commentListForm" method="post">
	
			<table id="commentList">
				<tr>
			
	
				</tr>
		</table>

	</form>
	</body>
</html>