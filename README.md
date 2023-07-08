## İstifadə edilən kitabxanalar:
``` java
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-data-jdbc'
	implementation group: 'mysql', name: 'mysql-connector-java', version: '8.0.33'
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-web'

}
```
## İstifadə edilən texnologiyalar:
 Spring Boot v3.1.0  
 JDK 17.02
 Jackson 2.15.0  
 Apache Tomcat 10.1.8

## News Server 
   Bu servis Rest api proyekti olub , newsapi.org'dan referans alınaraq hazırlanmışdır. İş prinsipi verilənlər bazasında bir-biri ilə əlaqəli olan cədvəllərdəki məlumatları client'ə (android app) HTTP protokolu istifadə edərək  streaming etməkdir.

##  JSON ağac iearxiyası: 
 ![menim iearxiya](https://github.com/akbarlee/News-Server/assets/62420106/139b486d-26fc-46d9-bdb5-28d97cda437b)



##  MySQL bazasında cədvəlin diagramı:
![Table iearxiya](https://github.com/akbarlee/News-Server/assets/62420106/7b0d0621-82db-40ec-a19c-8f4b9d85f26c)

##  Android tətbiqində kateqoriya filtirasiyası üçün yazdığım endpoint:

 ```java #7 
  @RequestMapping(value = "/news")
    public NewsApiResponse getAllNews(@RequestParam(name = "category", required = false) String category) {
        NewsApiResponse response = new NewsApiResponse();
        List<NewsHeadlines> newsList;
        if (category == null) {
            //  kateqoriya fərqi olmadan bütün resursları return et
            newsList = newsDAO.getAll();
        } else {
            //  kateqoriyaya görə resursları return et
            newsList = newsDAO.getAllByCategory(category);
        }
        response.setTotalResults(newsList.size());
        response.setArticles(newsList);
        if (response.getArticles() != null && !response.getArticles().isEmpty()) {
            response.setStatus("Success");
        }
        System.out.println("Response elementi "+ response.toString());
        return response;
    }
```
  Bu metodun içində ``` newsList = newsDAO.getAll() ```  http://localhost:8080/news sorğusu ilə bütün resursları çağırarkən,   ```newsList = newsDAO.getAllByCategory(category)``` metodu http://localhost:8080/news?category=general sorğusu ilə  verilənlər bazasında  <kbd>  general </kbd> dəyişəni ilə uyğun gələn bütün resursları çağırır.


