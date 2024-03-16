# 환자 정보 관리 API

현재 버전에서는 환자 정보를 생성, 조회, 수정, 삭제할 수 있는 RESTful API를 제공합니다.

## 기능

- 환자 정보 생성 (POST /patient)
- 환자 정보 리스트 조회 (GET /patient)
- 환자 정보 상세 조회 (GET /patient/{id})
- 환자 정보 수정 (PUT /patient/{id})
- 환자 정보 삭제 (DELETE /patient/{id})

## API 명세

### 환자 정보 생성 (POST /patient)

새로운 환자 정보를 생성합니다.

#### 요청

```json
{
  "name": "김태영",
  "hospitalId": 1,
  "gender": "M",
  "birth": "1991-09-29",
  "mobile": "010-2242-3836"
}
```

#### 응답

```
HTTP 200
```




### 환자 정보 리스트 조회 (GET /patient)

환자정보 리스트를 조회합니다.

#### 요청

```json
{
  "searchType": "NAME",
  "searchValue": "김태영",
  "usePaging": true,
  "pageSize": 10,
  "pageNo": 1
}
```

#### 응답

```
[
  {
    "patientName": "김태영",
    "registrationNumber": "24c8cafe469c4",
    "gender": "여자",
    "birth": "1991-09-29",
    "mobile": "",
    "latestCreateAt": "2024-03-16"
  },
  {
    "patientName": "김태영",
    "registrationNumber": "565d9e5a17c04",
    "gender": "남자",
    "birth": "1991-09-29"
    "mobile": "010-2242-3836",
    "latestCreateAt": ""
  }
]
```





### 환자 정보 상세 조회 (GET /patient/{id})

환자정보 단건을 상세조회 조회합니다.


#### 요청

```
/patient/2
```


#### 응답

```
{
  "id": 2,
  "name": "테스트1",
  "hospitalId": 1,
  "hospitalName": "Hospital A",
  "registrationNumber": "24c8cafe469c4",
  "gender": "여자",
  "birth": "1991-09-29",
  "mobile": ""
}
```




### 환자 정보 수정 (PUT /patient/{id})

환자정보 리스트를 조회합니다.

#### 요청

```
/patient/2

{
  "name": "배우리",
  "gender": "F",
  "birth": "1994-07-06",
  "mobile": "010-3411-3412"
}
```

#### 응답

```
HTTP 200
```



### 환자 정보 삭제 (DELETE /patient/{id})

환자정보 리스트를 삭제합니다.

#### 요청

```
/patient/2
```


#### 응답

```
HTTP 200
```



