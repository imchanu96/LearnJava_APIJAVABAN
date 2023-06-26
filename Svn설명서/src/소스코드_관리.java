
public class 소스코드_관리 {

	/*
	 소스코드란?
	 
	 소프트웨어를 개발하거나 유지보수를 하는 과정에서 발생하는 소스코드, 문서, 인터페이스 등
	 각종 결과물에 대해 소스코드를 만들고, 이들 소스코드에 대한 변경을 체계적으로 관리하기 위한 활동
	 
	 
	 @소스코드 관리의 장점
	 - 소스코드의 변화 내용을 저장하고 이것을 되돌리는데 용이
	 - 다양한 버전으로 분기하는 등의 다양한 관리 기능
	 - 개발 과정 중에 발생하는 다양한 문서들과 문서들의 버전 관리 : 프로젝트 전반에 대한 관리 가능
	 - 각 시점에 맞추어 내부적으로나 공식적으로 배포하는 것을 버전으로 관리 가능 ->
	 이를 버전 관리 시스템이라고 부른다.
	 
	 @소스코드 관리의 필요성
	 - 성공적이고 효율적인 소프트웨어 개발 프로젝트 수행
	 - 소스코드를 관리하지 않으면 다양한 이유로 소스코드가 유실되고
	 전체 소프트웨어의 개발 일정에 차질이 생김
	 - 기능별로 구현을 완료한 시점에 버전을 관리
	 - 새로운 기능을 구현하다가 문제가 생겼을 때 잘 되던 버전으로 
	 돌아가는 등의 작업을 손쉽게 가능
	 
	 
	 @소스코드 관리시스템의 종류
	 -CVS, SVN, Git
	 
	 
	 @소스코드 관리의 기본 용어
	 - Repository : 원본 소스를 저장하고 있는 저장소
	 - Working Tree : 소스코드 서버에서 내려 받은 코드가 있는 내 컴퓨터의 저장 장소(local)
	 - Commit : 수정된 사항을 반영하는 단계
	 - Update : 현재 소스코드 서버에 있는 최신 정보를 내 컴퓨터로 가져오는 단계
	 - Revision : 각 소스코드가 반영될 때마다 버전을 관리하는 것
	 - Rollback : 작업 디렉토리의 사본을 특정 revision 시점으로 되돌리는 단계
	 
	 @소스코드 관리방법
	 @소스코드 관리 고려사항
	 - 다수의 개발자들의 소스코드가 충돌되지 않도록 고려
	 - 가장 많이 신경써야 할 부분
	 - 개발자들간 소스코드 변동 및 해석의 어려움이 발생하지 않는 방법 고민
	 보안상 문제 고려
	 - 소스코드 관리 서버의 보안(내부 망, 외부 망)
	 - 사내 프로젝트는 외부에 최종 결과물 외에는 공개하지 않고 진행
	 - 내부 망으로 구성하여 외부인들이 소스코드를 확인할 수 없도록 관리
	 - 개발자들의 권한을 관리하여 소스코드의 열람 제한
	 - 각 개발자에 따라 소스코드를 검토하는 권한을 부여하여 잘못된 코드가
	 반영되는 것을  미연에 방지
	 - 각자의 스타일에 따라 코드를 보기 힘들 수 있으니 가독성 높은 코드 구현
	 
	 @오픈 소스
	 - 누구든지 언제나 소스코드를 볼 수 있고, 수정하여 반영할 수 있는 소스
	 @주의 사항
	 - 다수의 개발자가 참여할 수록 더욱 활성화되고 완성도가 높아짐
	 - 스타일과 코드의 안정적 동작을 위한 의사결정 체계를 민주적으로 구성
	 - 집단지성이 발휘될 수 있는 정책
	 - 가독성을 향상시킬수 있는 방안 모색
	 - 백업기능 강화
	 - 수많은 개발자가 관심을 가지고 참여할 수 있도록 독려
	 
	 @소스코드를 잘못 관리한 경우
	 - 개인관리
	 해당 프로젝트를 진행한 개발자가 없으면 무조건 중단될 수 있다.
	 
	 - 단순 파일 관리
	 소스코드를 압축하여 날짜별로 저장하는 경우
	 , 단순히 백업의 의미 외엔 용량만 차지하는 경우 발생
	 
	 - 코딩 스타일 관리 소훌
	 코딩 스타일을 전혀 고려하지 않고 무조건 백업하면 개발자마다 모두 다르게 구현
	 , 가독성이 매우 떨어져 다른 사람과의 협업이 매우 어려움
	 
	 - 테스트 없는 관리
	 테스트를 하지 않는다면 동작하지 않는 소스코드가 반영될 수 있다.
	 , 향후에 문제 발생 시, 문제점 확인 불가
	 
	 - 소스 버전 툴 투자 및 관리 소홀
	 개발 중 문제가 발생 시 해결기간이 개발기간보다 더 많은 시간 소요
	 
	 @형상관리의 기준
	  형상관리 단계
	 
	 단계 : 계획 -> 요구분석 -> 설계 -> 개발 -> 배포 -> 운영
	 
	 - 운영 이후 지속적인 업데이트는 앞의 순서를 그대로 따라서
	 순환하는 형태로 끊임없이 진행
	 
	 - 각 단계에서 관리할 기준을 정리하고 그에 맞게 관리가 이루어 진다면
	 효율적인 소프트웨어의 형상 관리가 가능
	 
	 @형상관리의 과거와 현재
	 - 과거의 형상관리 : 문서나 소스코드의 버전을 관리하는 수준
	 - 최근의 형상관리 : 다양한 프로젝트 관리 도구와 자동화 도구가 많이 활용
	 
	 형상 관리의 예 : TDD를 활용한 테스트
	 - TDD는 기준선이 되는 테스트 수행 방법을 정의하여
	 형상화하면, 이후의 테스트는 형상화된 테스트 수행 방법을 반복하면 된다는 개념
	 - 같은 방법으로 테스트 되기 때문에 테스트 자동화 가능
	 
	 
	 @다양한 소스코드 관리 시스템
	 
	 기존 기능들을 활용한 단순한 방법
	 - 문서를 만들 때 다른 이름으로 파일을 저장함
	 - 문서를 만들어서 변경점이 있을 때 마다 상세히 기록함
	 - 하나의 PC를 원격 드라이브로 지정 후, 매일 압축하여 해당 폴더에 업로드하고 저장함
	 - 공유 드라이브에서 파일을 불러와서 작업하고 바로 저장
	 - CD등의 데이터 장치에 매일 저장
	 - 웹하드에 주기적으로 저장 등등
	 
	 2. 소스코드 관리 시스템을 사용하는 방법
	 - 저장 형태에 따른 분류
	 로컬 형태 : 내 컴퓨터에서만 저장하고 소스코드를 관리하는 형태
	 중앙집중식 형태 : 오로지 서버에서만 소스코드를 관리하여 작업 중에는 항상
	 서버와 접속하여 실시간으로 소스코드를 관리하도록 하는 형
	 분산 형태 : 로컬형태와 중앙 집중식 형태의 장점을 결합하여
	  로컬에서 작업하다가 서버와 동기화 하는 형태
	  
	 @중앙 집중식 버전 관리 특징
	 
	 CVCS란(Central Version Control System):
	 중앙에서 관리하는 버전 관리 시스템
	 
	 - 여러 명의 개발자가 동시에 같은 소프트웨어를 개발할 때 유용하게 사용되는 방법
	 - 다수의 개발자가 소스코드를 공유하여 변경사항을 관리할 수 있음
	 - 혼자 사용할 경우에도 서버에 저장하게 되므로 백업을 하는 역활로도 사용 가능
	 
	 장점
	 - 누구나 다른 사람이 무엇을 하는지 알 수 있음
	 - 관리자는 각 개발자의 작업 내용을 꼼꼼히 체크 -> 대형 프로젝트일수록 관리가 편함
	 - 항상 최신의 소스코드를 함께 공유하여 개발 수행 -> 다른 기능들과의 연동을 위해
	 각 개발자의 로컬 소스를 전달받아 수정할 필요가 없음
	 
	 단점
	 - 중앙 서버가 잘못되면 모든 작업이 중단되어 유실됨
	 - 서버가 복구될 떄 까지 모든 개발 작업은 중지됨
	 - 서버가 손실되면 각자 작업 중이던 내용 외에는 별도로 관리된 내용이 없음
	 
	 
	 @분산 버전 관리(DVCS)란
	 DVCS(Distributed Version Control System):
	 중앙 집중식 버전 관리를 개선한 방법
	 
	 분산 버전 관리의 특징
	 - 저장소의 마지막 수정사항만 가져오는 것이 아닌, 해당 저장소를 통째로 복사해 옴
	 - 서버가 손실되어도 각 저장소의 복제된 부분만 가져오면 서버가 복구됨
	 - 다수의 연결 구조로 인해, 다수의 원격 저장소를 활용, 동시에 여러 그룹과 작업이 가능
	 
	 
	 
	 CVS(Concurrent Version System) 동시 버전 관리 시스템
	 - 오픈소스 프로젝트에서 많이 활용되었던 소스코드 관리 시스템
	 - 서버에 저장 및 수정 후에 반영하는 중앙 집중식 시스템
	 
	 장점
	 - 서버에서 소스를 복사 후 수정하고 다시 서버에 반영하므로,
	 하나의 파일을 수정하고 있어도 다른 개발자가 접근할 수 있음
	 - 파일 단위로 수정 이력을 관리할 수 있어 좀더 세분화된 관리가 가능함
	 
	 
	 @SVN(Subversion)
	 - CVS의 단점을 수정하기 위해 CVC를 개발한 개발자들이 참여해 만든 시스템
	 - CVS 개선 버전
	 
	 특징 
	 - Revision 단위의 이력 관리
	 - 파일과 디렉토리 이름이 변경되는 것도 관리가 가능함
	 - 저장소 내 일부 디렉토리 경로만 골라서 체크할 수 있음
	 - 변경 정보도 항상 로컬 컴퓨터에 저장하기 때문에
	 네트워크가 연결되지 않아도 소스코드의 모든 변경 정보를 확인할 수 있음
	 
	 단점
	 - 네트워크가 끊어지면 실제 수정 및 반영을 할 수 있는 작업은 불가능한
	 중앙 집중식의 형태를 활용함
	 - 네트워크가 끊어진 상황에서 소스코드 작업을 계속 수행하더라도 변경점을 저장하고
	 반영할 수 없음
	 - 서버가 연결되지 않은 환경에서는 사용하기 힘든 단점이 있음
	 
	 
	 @Git
	 - 분산 방식으로 실제 동작 방식에는 큰 차이가 없음
	 - 리눅스 토발즈라는 리눅스 개발자가 리눅스 개발 관리를 위해 만든 소스코드 관리 시스템
	 - 대형 프로젝트에서 효과적인 관리를 위해 가장 많이 사용되고 있는 소스코드 관리 시스템
	 
	 @Git의 핵심 목표
	 - 빠른 속도와 단순한 구조
	 - 비선형적인 개발과 완벽한 분산을 통해 대형 프로젝트에서 유용하게 사용하는것
	 */
}
