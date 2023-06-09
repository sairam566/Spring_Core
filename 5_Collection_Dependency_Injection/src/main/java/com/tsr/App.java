package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.list.Parcel;
import com.tsr.props.Profile;
import com.tsr.set.Store;

public class App {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("/com/tsr/config/application-context.xml"));

		// List
		Parcel parcel1 = factory.getBean("parcel1", Parcel.class);

		System.out.println(parcel1);
		
		//Util List
		Parcel parcel2 = factory.getBean("parcel2", Parcel.class);

		System.out.println(parcel2);

		// Set
		Store store = factory.getBean("store", Store.class);

		System.out.println(store);

		// Map
		com.tsr.map.Store store2 = factory.getBean("mStore", com.tsr.map.Store.class);

		System.out.println(store2);

		// Properties
		Profile profile = factory.getBean("profile", Profile.class);

		System.out.println(profile);
	}
}
