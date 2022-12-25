var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click',function () {
            _this.save();
        }) //코드 선언 이유=> js 파일 추가시 중복된 함수 이름을 덮어씌게 됨. 유효범위를 만들어 사용
    },
   save : function () {
          var data = {
              title: $('#title').val(),
              author: $('#author').val(),
              content: $('#content').val()
          };

          $.ajax({
              type: 'POST',
              url: '/api/v1/posts',
              dataType: 'json',
              contentType:'application/json; charset=utf-8',
              data: JSON.stringify(data)
          }).done(function() {
              alert('글이 등록되었습니다.');
              window.location.href = '/';
          }).fail(function (error) {
              alert(JSON.stringify(error));
          })
    }
}

main.init();