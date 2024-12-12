# [기능 목록]
## Core 클래스
- ### Car - 자동차 객체 한 개 정의
    - 필드
      - String carName
      - int position
    - 메서드
      - boolean isMove() -> 자동차의 전진 / 정지 유무 판별
      - void move() -> 자동차 움직임 제어
      - boolean isDuplicateWinner(Car car) -> 공동 우승자 판별
- ### Cars - 한 경기에 출전하는 자동차 전부를 처리
    - 필드
      - List<Car> cars
    - 메서드
      - List<Car> getWinner() -> 우승자 반환
- ### RaceController - 경기 진행 및 통제
    - 필드
      - Cars cars
      - int round -> 진행 횟수
    - 메서드
      - void playRace() -> 레이스 진행
- ### RaceResult - 경기 결과 관리
    - 
    

## Utility 클래스
- ### InputHandler
- ### OutputHandler
- ### RandomGenerator
    - 메서드
      - int generateRandomNumber() -> 1 ~ 6까지의 랜덤 정수 생성
