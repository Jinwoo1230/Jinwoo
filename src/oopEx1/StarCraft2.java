package oopEx1;

import oopEx1.TerranSteamPack.SteamPack;
/*
 * 인터페이스의 강의 파일입니다. 
 */
public class StarCraft2 {
	public static void main(String[] args) {
		Marine m1 =  new Marine("마링","이등병", 60,6); 
		FireBet f1 = new FireBet("퐈뺏", "상병", 60,16);
		Medic md1 = new Medic("간호사", "하사", 60,0);
		Ghost g1 = new Ghost("고스트","대위",60,100);
		
		//모든 공격 유닛에게 공격 명령을 내립니다.
		((Attackable)m1).attack("저그");
		((Attackable)f1).attack("저그");
		
		((Moveable)m1).move(100,100);
		
		TerranSteamPack.SteamPack SteamPack = new SteamPack(m1);
		TerranSteamPack.SteamPack SteamPack2 = new SteamPack(f1);
		
		SteamPack.steamPack();
		SteamPack2.steamPack();
		
		//Ghost 유닛을 만든 후, 좌표 550, 350 지점에 핵폭탄을 유도해보세요.
		Ghost ghost = new Ghost ("유령","대위",30,20);
		ghost.nuclearLaunch(550,350);
	}
}