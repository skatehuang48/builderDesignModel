package com.builder.buuilder;

import com.builder.product.ComputerProduct;

/**
 * ����ĵ��Խ����ߣ�����ƷComputerProduct�ĸ�����������ԣ��Ĵ������̳��󵽴�����
 * ͬʱ�ṩ�˷�����ɲ�Ʒ�ķ���
 * ������ķ����������Ϳ�����AbstractComputerBuilder(��builder)����
 * �����Ϳ�����ʽ����������ˣ�this.builder.buildCpu().buildHardDisk().buildKeyBord().buildMainBord();
 * ע�ⷽ�����η��������Ϊpublic�������������޷�����
 *
 */
public abstract class  AbstractComputerBuilder {
	//�����Ʒ����ĸ�����Ĵ�����װ�䷽��
	public abstract AbstractComputerBuilder buildCpu();
	public abstract AbstractComputerBuilder buildMainBord();
	public abstract AbstractComputerBuilder buildKeyBord();
	public abstract AbstractComputerBuilder buildHardDisk();
	//���巵����������ķ���
	public abstract ComputerProduct getComputerProduct();
}
