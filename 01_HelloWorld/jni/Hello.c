#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

jstring Java_com_itheima_helloworld1_MainActivity_helloFromC(JNIEnv* env, jobject obj){
	//c���Ե��ַ���
	char* cstr = "hello from c";
	//��C���Ե��ַ���ת����java���ַ���
	// jstring     (*NewStringUTF)(JNIEnv*, const char*);
//	jstring jstr = (*(*env)).NewStringUTF(env, cstr);
	jstring jstr = (*env)->NewStringUTF(env, cstr);
	return jstr;
}
