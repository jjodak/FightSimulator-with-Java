# ⚔️ Fight Simulator with Java
> **동양미래대학교 인공지능소프트웨어학과** > **20252365 조준혁** (JunHyuk Cho)
---

### 📝 Repository Overview
이 저장소는 자바 프로그래밍의 핵심인 **객체지향 프로그래밍(OOP)** 원리를 실전적으로 적용한 **1대1 턴제 배틀 시뮬레이터** 프로젝트를 담고 있습니다. 추상 클래스, 인터페이스, 상속 및 다형성을 활용하여 게임 로직을 설계하고, 플레이어 간의 전략적인 능력치 배분과 스킬 대전 시스템을 구현하였습니다.

### 📅 핵심 설계 요소 (Core Logic)

| 구성 요소 | 역할 및 기능 | 핵심 키워드 |
| :--- | :--- | :--- |
| **FighterBase** | 캐릭터의 기본 속성(HP, MP, ATK, DEF)을 정의 | 추상 클래스, 필드 캡슐화 |
| **Skillset** | 모든 캐릭터가 공통으로 가져야 할 스킬 규격 정의 | 인터페이스, 추상 메소드 |
| **Fighter1 & 2** | `FighterBase`를 상속받아 고유 스킬 및 데미지 로직 구현 | 상속, 메소드 오버라이딩 |
| **Game System** | 능력치 배분(1000pt 제한), 턴제 전투 루프 관리 | 배틀 로직, 입력 제어 |
| **Stat Balance** | 체력/마나/공격/방어의 합계가 1000을 넘지 않도록 제한 | 예외 처리, 조건부 로직 |

### 🚀 주요 구현 역량 (Highlights)
* **Object-Oriented Design:** 인터페이스(`Skillset`)와 추상 클래스(`FighterBase`)를 분리하여 코드의 재사용성과 확장성을 고려한 설계.
* **Game Mechanic Logic:** 플레이어별 고유 키 매핑(q/w/e vs u/i/o)을 통한 사용자 입력 처리 및 실시간 상태 반영.
* **Dynamic Battle Balance:** 한정된 포인트(1000) 내에서 전략적으로 스탯을 분배하고, 마나 소모량과 데미지 계산 로직을 통한 게임 밸런싱.
* **UI/UX Simulation:** 콘솔 환경에서 플레이어의 현재 상태와 전투 로그를 직관적으로 출력하여 게임의 몰입도 향상.

### 📂 폴더 구조 (Project Structure)
* `src/FightSimulator/`: 캐릭터 클래스 및 게임 엔진 소스 코드 (`.java`).
* `bin/FightSimulator/`: 컴파일된 바이트 코드 (`.class`).
* `20252365 조준혁.pptx`: 프로젝트 요약 및 객체지향 설계 구조 발표 자료.
* `README.md`: 프로젝트 소개 및 상세 설명.

---
Copyright © 2025 JunHyuk Cho. All rights reserved.
