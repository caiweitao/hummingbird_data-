package com.gzyouai.hummingbird.data.config;

/**
 * @author 蔡伟涛
 * @Date 2021年4月28日
 * @Description 
 */
public class CacheConfig {
	public static int cacheType = 1;//当前缓存类型
	public static int maxElementsInMemory = 50000;//一个缓存最大存储数量
	public static long savePeriod = 60*1000;//多久保存一次数据到数据库（毫秒）
	
	//缓存类型
	public final static int CACHE_TYPE_LRU = 1;//本地缓存
	public final static int CACHE_TYPE_LRU_REDIS = 2;//redis缓存
}
