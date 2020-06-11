function memberInfo(memberInfo){
    const member = JSON.parse(memberInfo);

    const $orderName= $("#orderName");
    const $orderZip = $("#orderZip");
    const $orderAddress = $("#orderAddress");
    const $mail1 = $("#orderMail1");
    const $mail2 = $("#orderMail2");	
    const $orderPhone = $("#orderPhone");
    const $orderTel = $("#orderTel");


    $orderName.val(member.name);
    $orderZip.val(member.zip);
    $orderAddress.val(member.address);
    $orderPhone.val(member.phone);
    $orderTel.val(member.tel);


    //이메일 파싱///////////////
    const $log = member.mail;
    const $reg = $log.split("@");
    $mail1.val($reg[0]);
    $mail2.val($reg[1]);
}