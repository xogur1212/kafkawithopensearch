
## 23/10/14
### 1. opensearch docker compose-up
#### 참고 https://tommypagy.tistory.com/342
#### 설치후 http://localhost:5601/  admin에 admin으로 로그인
#### 
### 2. kafka docker compose-up
#### 참고 https://devocean.sk.com/blog/techBoardDetail.do?ID=164007
#### 
### 3.kafka spring boot에서의 테스트
#### 3.1 카프카 config 세팅
#### 3.2 하나의 서비스에서 카프카로 send 후 listen 하는 부분 작성
#### 3.3 http 에서 요청후 topic에 대해서 리슨 하는지 확인
### 4. opensearch 관련 작업
#### 참조 https://github.com/opensearch-project/spring-data-opensearch
#### 참조2 https://velog.io/@backtony/Spring-Data-Elasticsearch-%EC%97%B0%EB%8F%99-%EB%B0%8F-%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%9E%91%EC%84%B1%ED%95%98%EA%B8%B0
#### 참조3 https://github.com/M-Razavi/Spring-Data-OpenSearch-Example/blob/master/src/main/java/org/opensearch/data/example/controller/BookController.java


#### 23/10/15 
#### 이슈  maven 프로젝트에선 실행되는데 Gradle에선 Error creating bean with name 'bookRepository' defined in com.example.kafkawithopensearch.opensearch.adapter.repository.BookRepository defined in @EnableElasticsearchRepositories declared on KafkaWithOpenSearchApplication: Failed to instantiate [org.springframework.data.elasticsearch.repository.support.SimpleElasticsearchRepository]: Constructor threw exception 같은 에러 발생
#### 시간이 지나니까 해결 .... 뭐가 문제였을까 ...

#### 참고 https://github.com/spring-projects/spring-kafka/blob/bfcf3b70411208eb4c1436f2edd3c914d486e118/spring-kafka/src/main/java/org/springframework/kafka/annotation/KafkaListener.java#L4
#### 버전에 맞는 Serialize 추가 
#### kafka 로 메시지 보내고 받아서 opensearch로 저장 및 , 읽어오기 까지 
