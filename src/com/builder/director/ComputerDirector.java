package com.builder.director;

import com.builder.buuilder.AbstractComputerBuilder;
import com.builder.product.ComputerProduct;

/**
 * 
 * ָ���ߣ���ͻ��˽��������ݿͻ��˴���ľ���builder������ͬ�Ĳ�Ʒ����
 *
 */
public class ComputerDirector {

	private AbstractComputerBuilder builder;
	
	//1.���췽����ʽע��builder
	public ComputerDirector(AbstractComputerBuilder builder){
		this.builder = builder;
	}
	//2.set��ʽע��builder
	public void setAbstractComputerBuilder(AbstractComputerBuilder builder){
		this.builder = builder;
	}
	
	//��ʼ�������װ�ز�Ʒ
	public ComputerProduct build(){
		return this.builder.buildCpu().buildHardDisk().buildKeyBord().buildMainBord().getComputerProduct();
	}
}
