<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
	<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" >
		添加
	</button>
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">添加规格</h5>
        <button type="button" onclick="addProp()">添加属性</button>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
          
          
        </button>
      </div>
      <div class="modal-body">
			<form id="addspec" >
				<div class="form-group">
				    <label for="specName">规格名称</label>
				    <input type="text" class="form-control" id="specName" name="specName" aria-describedby="specNamelHelp">
				    <small id="emailHelp" class="form-text text-muted">请输入规格名称</small>
				</div>
				<div class="form-group">
				    <label for="specName">屬性值</label>
				    <input type="text" name="option[0].optionName" class="form-control" id="specName" aria-describedby="specNamelHelp">
				    <button onclick="$(this).parent().remove()">刪除</button>
				</div>
			</form>
      </div>
      
      
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" onclick="commitSpec()">提交</button>
      </div>
    </div>
  </div>
</div>
</div>
<table class="table">
  <tr>
    <th>ID</th>
    <th>名称</th>
    <th>详情</th>
  </tr>
  <c:forEach items="${info.list}" var="s">
  <tr>
    <td>${s.id}</td>
    <td>${s.specName }</td>
    <td>
    	<c:forEach items="${s.option}" var="g">
    		&nbsp;&nbsp;${g.optionName}
    	</c:forEach>
    </td>
  </tr>
  </c:forEach>
</table>

<script type="text/javascript">
	var addindex=1;
	function addProp() {
		$("#addspec").append('<div class="form-group">'+
			    '<label for="specName">属性值</label>'+
			    '<input type="text" name="option['+addindex+'].optionName" class="form-control" id="specName" aria-describedby="specNamelHelp">'+
				'<button onclick="$(this).parent().remove()">刪除</button>'+
			    '</div>');
		addindex++;
	}

	/**
	  提交数据	
	*/
	function commitSpec(){
		//addspec
		var formData = new FormData($("#addspec")[0]);
		$.ajax({url:"/spec/add",
			  dataType:"json",
			  data:formData,
			  // 让jQuery 不要再提交数据之前进行处理
			  processData : false,
			  // 提交的数据不能加消息头
			  contentType : false,
			  // 提交的方式 
			  type:"post",
			  // 成功后的回调函数
			  success:function(data){
				 alert(data)  
				 
			  }
			  })
		
	}
</script>

