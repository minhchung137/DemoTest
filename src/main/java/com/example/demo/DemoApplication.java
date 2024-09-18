package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    //Quản lý sinh viên
	//sinh viên(name,studentCode, score)
	//lấy ra danh sách tất cả sinh viên
	//thêm một sinh viên mới vào danh sách
	//update điểm cho sinh viên
	//delete một sinh viên nào đó

	public static void main(String[] args) {SpringApplication.run(DemoApplication.class, args);
	}
	//Restfull API
	//Cách đặt tên API
	// /api/name
	//Một api có nhiểu method
	/* METHOD
		POST => Create
		PUT => update
		DELETE => delete
		GET => get
		/api/student  => POST : tạo thêm một sinh viên mới
		/api/student/1 => PUT : update thông tin của thằng student 1
		/api/student => GET : lấy ra thông tin tất cả student
		/api/student/1 => GET : lấy ra thông tin của student 1
		/api/student/1 => DELETE : delete thông tin của thằng student 1

	 */
}
