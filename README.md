# SpringQuickStart

1. 이 프로젝트는 SpringQuickStart 책을 기반으로 하는 실습 내용
   1. JDK 1.8(Oracle downloads)
   2. Eclipse(2021-09) not STS
   3. Tomcat 8.5
   4. DB -> H2를 통한 처리
   5. Eclipse -> install New Software를 통해 처리
      1. https://download.springsource.com/release/TOOLS/update/e4.12

2. Spring의 기본 구조

   1. BoardWeb의 구조

      1. src/main/resource/application.xml 파일에 bean을 등록한다.
         이 applicationContext를 Spring Framework에서는 Container(Bean을 담는 그릇)이라 한다. 

      2. Container 안에는 applicationContext.xml에 등록한 bean(java 파일, 일반적으로 class)들을 담는다. 

      3. 사용자가 요청을 하는 경우 해당하는 bean을 applicationContext.xml에서 찾는다. 

         AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
         CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
         과 같은 형식으로 사용자 java 파일에 지정한다.

      4. applicationContext.xml 은 해당 java 파일에 대한 객체를 return 한다.
