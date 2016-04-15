#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

jstring Java_com_itheima_helloworld1_MainActivity_helloFromC(JNIEnv* env, jobject obj){
	//cÓïÑÔµÄ×Ö·û´®
	char* cstr = "hello from c";
	//°ÑCÓïÑÔµÄ×Ö·û´®×ª»»³ÉjavaµÄ×Ö·û´®
	// jstring     (*NewStringUTF)(JNIEnv*, const char*);
//	jstring jstr = (*(*env)).NewStringUTF(env, cstr);
	jstring jstr = (*env)->NewStringUTF(env, cstr);
	return jstr;
}
