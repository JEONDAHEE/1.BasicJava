package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Calendar; //30�� ���� ���ϸ����� �����ϴ� ����� �����ҋ� �ʿ��� improt
//import java.util.Date; //30�� ���� ���ϸ����� �����ϴ� ����� �����ҋ� �ʿ��� improt

import vo.MileageVo;
import dao.MileageDao;
import data.Session;



public class Mileage {
	public static void printMileageInfo(){
		MileageDao mileagedao = MileageDao.getInstance();
		
		
		ArrayList<MileageVo> mileageList = mileagedao.searchUserMileage(Session.loginUser.getId());
		
		for(int i = 0 ; i < mileageList.size()-1;i++){
			for(int j = i ; j < mileageList.size();j++){
				if(mileageList.get(i).getDate().compareTo(mileageList.get(j).getDate())==1){
					MileageVo temp = mileageList.get(i);
					mileageList.set(i, mileageList.get(j));
					mileageList.set(j, temp);
				}
			}
		}
		
		
		
		int sum = 0;
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm");
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("��¥\t\t\t����\t\tȹ�渶�ϸ���");
		for(int i = 0; i < mileageList.size();i++){
				String time = format.format(mileageList.get(i).getDate());
				System.out.print(time+"\t");
				if(mileageList.get(i).getContents().length()>6){
					System.out.print(mileageList.get(i).getContents()+"\t");
				}else{
					System.out.print(mileageList.get(i).getContents()+"\t\t");
				}
				System.out.println(mileageList.get(i).getMiliage());
				sum+=mileageList.get(i).getMiliage();
		}
		
		System.out.println("���� ���ϸ��� : "+sum);
		System.out.println("---------------------------------------------------");
		
		
	}

}
