package com.kh.FileEx;

import java.io.File;

/*
 write close exists mkdir
 
File
	파일이나 / 폴더(디렉토리)를 관리하는 클래스
	파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능을 제공
메서드
	boolean mkdir() : 폴더 생성 make 폴더
	boolean mkdirs() : 경로로 지정해준 모든 폴더 생성
	boolean createNewFile() : 파일생성
	boolean delete : 파일이나 폴더 삭제
	String getName() : 파일 이름을 가져와서 보여줌
	String parent() : 파일이 저장된 폴더를 알려줌
	String getPath(): 폴더 전체 경로 확인
	boolean isFile : 현재 file객체가 관리하는게 파일이면 true
	boolean isDirectory : 현재 file객체가 관리하는게 폴더이면 true
	boolean exists : 파일이나 폴더가 존재한다면 true, 없다면 false
	long    lenght : 파일 크기 알려줌
	long lastmodified : 폴더 내 파일목록을 String[] 알려줌
	File[] listFile() : 폴더 내 파일목록을 File[]배열로 보여줌
 */
/*
[개발자 상식]

os:컴퓨터가 윈도우인지 맥북인지 리눅스인지 나타내는 운영체제

	윈도우 | 리눅스 맥북
	폴더  | 디렉토리
	
-경로 표기 방법(폴더 경로, 파일위치 표시)
	\,/			/
-Java 언어는 /, 관계없이 모두 경로로 표시 가능하게 설정이 되어있음

    ┌절대경로 : C:/부터 시작해서 모두 작성해주는 경로
    │
경로 └상대경로 : 내가 위치한 폴더나 파일 기준으로 폴더를 작성해주는 것
			 ./  : 현재 내 폴더 위치를 나타냄
			 ../ : 현재 내 폴더에서 한단계 더 위로 이동하는 것을 의미함
			
			
 */
/*
 * 
 * 
 * 
 */
public class Fileex {
	public static void main(String[] args) {
		//      C:/User/user/Desktop
		
		File 폴더만들기 = new File("C:/User/user1/Desktop/newFFF");
		
		System.out.println("존재합니까?"	+ 폴더만들기.exists());
		//만약에 폴더가 존재한다면 폴더가 이미 바탕화면에 존재합ㄴ디ㅏ. 라고 예기하고
		if(폴더만들기.exists())	{
			System.out.println("폴더가 이미 존재합니다.");	
		}else {
			폴더만들기.mkdir();                                                                                                                                                     
			System.out.println("폴더 새로 만들기 성공!");
			System.out.println(폴더만들기.getName()); //폴더 이름 확인
			System.out.println(폴더만들기.getPath()); //폴더 주소 확인
		}
	}
}
