package com.builder;

import com.builder.buuilder.AbstractComputerBuilder;
import com.builder.buuilder.AcerComputerBuilder;
import com.builder.buuilder.DellComputerBuilder;
import com.builder.director.ComputerDirector;

public class ClientTest {
	public static void main(String[] args) {
		//客户端测试类，不直接创建产品对象即new ComputerProduct()
		AbstractComputerBuilder dellBuilder = new DellComputerBuilder();
		AbstractComputerBuilder acerBuilder = new AcerComputerBuilder();
		ComputerDirector dellDirector = new ComputerDirector(dellBuilder);
		dellDirector.build();
		System.out.println("----------------------------");
		ComputerDirector acerDirector = new ComputerDirector(acerBuilder);
		acerDirector.build();
	}
}
