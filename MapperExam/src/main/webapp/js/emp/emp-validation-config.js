/**
 *
 */
$("#addForm").validate({
  rules: {
    // 유효성 검사 규칙
   	  ename: {       // id별명
   	  required: true, // 필수 입력
      minlength: 2,   // 최소 입력 길이
    },
      job: {
      required: true, // 필수 입력
      minlength: 2, // 최소 입력 길이
    },
          manager: {
      required: true, // 필수 입력
      minlength: 2, // 최소 입력 길이
    },
          hiredate: {
      required: true, // 필수 입력
      minlength: 2, // 최소 입력 길이
    },
          salary: {
      required: true, // 필수 입력
      minlength: 2, // 최소 입력 길이
    },
          commission: {
      required: true, // 필수 입력
      minlength: 2, // 최소 입력 길이
    },
       dno: {
      required: true, // 필수 입력
      minlength: 2, // 최소 입력 길이
    }
  },
  messages: {
    // 오류값 발생시 출력할 메시지 수동 지정
      ename: {   // id별명
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    },
   	  job: {
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    },
      manager: {   // id별명
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    },
      hiredate: {   // id별명
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    },
      salary: {   // id별명
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    },
      commission: {   // id별명
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    },
      dno: {   // id별명
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    },                
  }
});
