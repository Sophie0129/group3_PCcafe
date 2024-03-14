module group3_PCcafe {
	exports test;
	exports chat;
	exports login.register;
	exports login.findPw;
	exports login.nonMember;
	exports login.findId;
	exports login.memberLogin;
	exports login;

	requires java.sql;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
}