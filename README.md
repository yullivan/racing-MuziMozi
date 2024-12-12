# [기능 목록]
## Core 클래스
- ### Car - 자동차 객체 한 개 정의 (이름, 이동 거리)
    - 필드
      - String carName
      - int position
    - 메서드
      - void move() -> 자동차 움직임 제어
      - boolean isDuplicateWinner(Car car) -> 공동 우승자 판별
- ### Cars
    - 필드
      - List<Car> cars
    - 메서드
      - boolean isMove() -> 자동차의 전진 / 정지 유무 판별
      - List<Car> moveCars() -> 랜덤으로 자동차들을 이동
      - List<Car> getWinner() -> 우승자 반환
- ### RaceController
    - 필드
      - int round -> 진행 횟수
    - 메서드
      - 
    

## Utility 클래스
- ### InputHandler
- ### OutputHandler
- ### RandomGenerator
    - 메서드
      - int generateRandomNumber() -> 1 ~ 6까지의 랜덤 정수 생성
