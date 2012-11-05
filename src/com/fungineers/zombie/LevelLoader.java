package com.fungineers.zombie;


public class LevelLoader 
{
	public static String[] levels = {"Baby Steps|5000|null|null|1820,3258,4551|2345|25|20|12" 
		,"A Bit Harder|10000|null|null|1258,8759,6219,7696,4442,3117|2350,3815,5082,6799,8030,9371|45|35|25"
		,"The Ring|7500|881,1084,1305,1588,1930,2153,2376,2596,2804,3061,3366,3716,4023,4124,4248,4447,4341,4545,4657,5680,5973,6153,6368,6555,6791|17,20,24,29,33,116,224,239,230,84,20,21,95,98,98,98,94,98,105,17,22,158,29,199,46|639,3733,5395,7028|4891,2436|30|20|14"
		,"The Wave|10000|355,522,788,920,1185,1484,1733,2082,2246,2346,2425,2509,2609,2720,2817,2999,3284,3382,3512,3649,3753,3822,3918,4046,4179,4315,4447,4609,5516,5762,6112,6292,6541,6764,6973,7103,7286,7524,7718,7928,8089,8287,8550,8799,9027,9159,9207,9259,9349,9568,9824,9702,9448,4878,5051,5244,5400|17,31,34,139,246,246,120,5,75,188,286,292,205,105,14,19,223,226,226,226,226,226,226,226,226,182,93,65,193,211,218,167,113,55,41,119,220,230,239,243,171,78,24,149,200,185,139,70,77,70,70,70,70,25,32,53,165|8933,7637,3870,3486,3202,2389|1131,5760,7232,9884|34|25|17"
		,"Another Day I|10000|375,615,881,1228,1593,2038,2847,2678,2499,3297,3454,3652,3861,4017,4132,4228,4371,4573,5541,6032,6391,6806,7211,7617,8200,9488|40,40,49,54,61,59,207,200,198,40,41,51,101,168,210,177,130,27,42,42,257,41,252,53,59,42|9754,9515,8949,8395,7101,6421,5078,4015,2974,2134|2498,4646,5572,6077,7668,8549,9947|45|30|20"
		,"Over 9000|9001|781,1174,1527,1944,2403,2679,2983,3279,3710,4059,4343,4643,4903,5293,6194,6269,6360,6452,6550,6623,6698,7090,7952,8565,8615,8656,8697,8737,8588,8671,8633,8769|9,16,21,23,276,271,267,15,13,13,243,241,242,34,34,175,209,247,231,188,53,26,23,24,24,24,24,24,28,20,25,27|3344,6335,8293|8034,7369,5592,4445,2387|43|28|18"
		,"Survival I|15000|870,1638,2424,3163,3867,4603,5400,6180,6884,7828,8635,9372,10045,10778,11609,12410,13209,14015,14604,12905,10304,8970,7155,5712,4084,1246|8,21,22,22,20,19,19,19,19,17,18,18,18,18,18,23,26,26,27,310,313,313,313,313,313,313|1113,1390,1815,2137,3025,3733,4563,5295,6267,7077,8028,8927,9982,10212,11381,12456,15213,15067,14925,14774,14573,14405|14605,14369,13891,13330,12978,11957,10759,9547,8598,7602,5730,4833,4011,3273,2588,1550|70|55|44"
		,"Surprise|17000|513,757,1011,1343,1646,1956,2220,2388,2586,2720,2877,3077,3254,3787,4290,4571,4886,5215,5421,5671,6655,7603,8674,9471,10466,11274,11410,11569,11790,11966,12169,12420,12806,12987,13216,13442|12,12,17,169,212,129,6,244,11,279,25,270,43,41,44,208,207,205,99,53,53,61,256,53,253,23,23,23,23,30,43,43,250,273,16,22|13788,13567,14030,14513,14938,15359,15760,16184,16710,1485,2604,4053,5942,7098,9137,10247|16393,15898,15512,15090,14628,14203,13778,13307,12808,10778,9603,7940,4604|85|65|50"
		,"12345|12345|440,761,1210,1751,2186,2633,3073,3605,4192,4708,5232,5755,6011,6364,6444,6530,6630,6712,6807,7446,8483,9420,10060,10766,11150,11614,11380,12072|-4,1,239,268,234,24,264,263,260,260,260,260,90,54,173,221,237,188,66,85,243,44,276,45,241,242,240,18|11302,10247,9612,7750,4505,2915|1209,3623,6376,8640,9793,12216,11864|55|40|25"
		,"Jump and Shoot|22000|631,890,1161,1326,1427,1547,1648,1770,1912,1962,2047,2165,2289,2374,2438,2666,2820,2936,3037,3843,3899,3995,4654,4725,4823,5508,5524,5540,5553,5569,6103,6773,7390,8052,8683,6432,7712,8935,9149,9353,9549,9706,9850,10025,10182,10348,10504,10695,10899,11190,11468,11738,11887,12111,12283,12419,12728,13246,13863,14573,15041,15539,15955,16038,16110,15787,15852,16745,16824,16903,16987,17063,17523,17953,18335,18604,18814,19098,19463,19836,20185,20563,20741,21018,21392|-1,-6,-1,194,245,256,195,14,20,180,248,251,246,183,15,19,34,145,256,9,126,266,7,132,225,29,84,134,192,244,247,245,245,245,245,18,25,-2,243,14,260,262,268,266,273,276,275,265,265,27,14,130,227,245,104,-4,6,214,221,221,0,6,225,147,53,28,160,23,168,253,169,28,28,37,192,211,211,204,204,205,205,205,30,34,38|20277,19608,18848,18206,15197,14284,12861,11892,10697,9031,8113,6992,4213,3271,1996|17197,16246,13358,9669,5730|80|68|56"
		,"Shoot and Jump|22000|473,803,1122,2323,2554,2747,2935,3882,4158,4515,4908,5501,5751,6027,7338,7804,8106,9082,9323,9567,9751,9942,10667,11274,12048,13533,14040,15217,16005,17221,17709,18154,18602,19073,19558,19941,20262,20516,20700,20921|2,9,12,206,209,210,210,9,24,24,24,199,209,208,15,25,25,28,258,40,271,57,51,49,69,262,262,38,41,274,275,16,22,22,22,22,228,231,31,37|21130,20370,19988,19225,17632,17121,16287,15409,13819,11529,10204,9637,8569,6613,3441|1334,2218,5142,6192,7050,9273,10778,12340,13261,14382,18228,21278|90|76|65"
		,"Another Day II|20000|453,877,1231,1401,1591,1800,1938,2095,2514,3007,3463,3694,3926,4002,4213,4508,4710,4796,4864,4934,5037,5102,5200,5306,5403,5501,5557,5629,5807,5999,6120,6227,7354,7774,7940,8072,8196,8319,8486,8907,9361,9800,10332,10760,11076,11472,11970,12419,12843,13114,13263,13418,13614,13813,13996,14347,15124,15646,15717,15793,15592,15848,15848,16081,16134,16180,16239,16285,16889,17354,17905,18486,19008,19394,19818|29,36,37,179,239,248,187,39,27,38,212,246,245,213,36,45,45,45,45,45,45,45,45,45,45,45,172,234,243,245,171,21,36,264,46,274,45,287,65,246,247,246,250,36,46,49,292,296,298,21,186,284,301,187,27,15,8,205,298,210,41,45,43,40,187,324,203,47,16,37,235,58,281,40,40|19460,18895,17792,16564,15849,14105,13403,12160,9452,6763,4000|1597,6902,12294,19098|80|62|52"
		,"Sonic Boom|30000|403,468,552,652,767,858,986,1152,1383,1705,2117,2543,2765,3046,3452,3835,4010,4286,4575,4943,5198,5429,5659,5827,6043,6211,6314,6422,6671,6846,7101,7334,7463,7664,7857,7964,8058,8156,8267,8319,8396,8479,9228,9353,9454,9561,10067,10139,10214,10287,10377,10472,10563,10983,11156,11332,11445,11755,11622,12164,12419,12625,12802,13016,13251,13394,13506,13867,14055,14159,14524,14625,14720,15158,15314,15463,15651,15829,15997,18207,21844,21853,21860,21868,21874,21884,21892,21902,21909,21916,21925,22538,22744,22879,22984,23054,23105,23147,23179,23208,23416,23832,24290,24645,24997,25445,25677,25991,26245,26411,26692,27019,27331,27440,27635,27767,27909,28034,28131,28293|12,12,12,12,12,12,12,12,11,12,12,12,131,170,212,192,104,4,15,26,187,190,193,193,194,257,135,16,154,219,264,228,43,13,14,23,22,24,16,116,192,245,5,103,205,281,253,33,263,7,241,22,243,19,34,34,34,34,34,176,227,240,159,37,37,135,274,33,200,345,12,112,261,-1,16,19,26,28,31,22,14,15,11,15,12,11,11,11,11,12,13,199,249,188,230,187,262,195,244,203,15,21,29,22,23,23,232,249,230,24,38,57,240,49,43,274,37,204,257,288|null|null|25|20|12"
		,"Start and Stop|25000|442,651,848,1114,1255,1365,1456,2675,2774,2854,2952,3048,3588,4025,4372,4680,5021,5388,5720,6975,7089,7207,7800,8002,8278,8568,8737,8925,9210,9527,10107,10796,11530,11683,11838,12070,12291,12442,12643,12858,13027,13237,13380,13519,13670,13805,13988,15831,15933,16041,16136,16230,18410,18613,18923,19257,19587,19950,20259,20570,20921,21267,21566,21970|-6,-3,2,4,176,267,294,28,28,28,28,28,28,28,28,28,28,28,28,226,227,227,22,24,24,24,269,22,22,22,22,22,22,23,26,27,27,27,27,27,27,27,27,27,27,27,27,30,232,44,241,32,29,29,29,29,29,29,29,29,29,29,30,30|5847,6481,9727,10255,11115,14072,15340,22176,22407,23536,23279|6100,14259,14595,14936,16584,16232,17041,17407,17870,22793,23819|67|55|45"
		,"Another Day III|30000|376,591,800,995,1230,1489,1721,1924,2017,2149,2321,3614,4245,5053,5720,6524,7007,7421,7594,7769,7937,8081,8377,8897,9275,9758,10013,10396,10724,11009,11751,12522,14167,15308,16005,16621,17291,17825,17914,18050,18318,18538,18772,19632,19866,20163,20412,20708,20961,21869,22085,22433,22773,23097,23453,23939,24569,25285,26068,26741,27357,27783,27911,28051,28191,28482,28645,28832,28991,29126,29340,29537|-5,-6,-11,-3,192,232,191,8,120,249,271,15,248,33,250,26,37,268,268,268,268,268,268,26,28,31,211,277,215,31,35,248,289,26,28,32,33,33,191,270,271,192,33,20,181,245,260,178,20,20,210,253,195,28,50,244,37,253,29,246,41,244,245,245,245,35,35,35,35,35,35,163|28110,27528,26382,24831,23729,22223,18044,14536,12738,10162,7661,4008|2326,5814,8219,13396,19015,21189,24163,25288,25547|100|88|77"
		,"Survival II|30000|330,549,774,842,873,920,989,2126,3191,4369,5259,7066,8298,9501,10431,11859,13208,13867,15485,16962,22386,23646,25253,26788,28339,29714,29714,26803,26764,26739,26709,25258,25265,23632,23617,23601,22365,22345,16970,16978,16985,15491,15497,13877,13197,13177,10439,9481,8312,5241,4382,3176,3159,3144,2109|-5,2,3,86,157,245,296,31,50,269,44,43,34,36,239,35,32,252,32,34,35,22,233,5,23,33,33,6,9,8,5,236,237,25,21,22,39,38,38,35,36,31,30,259,32,31,242,44,37,53,268,60,59,55,32|30105,29889,29389,28844,28458,27980,27857,27724,27605,27471,27328,27185,27035,26891,25989,24950,24194,22050,21520,15769,14210,13278,12798,12529,12218,11899,11563,11194,10682,10188,9692,8840,7829,7267,6539,5527,4659,3407,2638,2223|1398,2392,3809,5962,9937,10401,13580,14922,16287,23880,23566,23224,22852,22362,29156|130|110|95"
		,"Tiro Finale|45000|434,675,930,1152,1317,1505,1505,1513,1524,1532,1541,2076,2080,2085,2088,2093,3171,3578,3998,4592,5199,5474,5879,6543,6847,7377,7703,7929,8251,8609,9209,9541,9956,10470,10750,11035,11324,11582,12057,12452,13090,13304,13534,13820,14092,14450,14930,15098,15260,15916,16000,16169,16734,16796,16873,17933,20505,21978,23790,25021,23903,24014,24154,24297,25900,26100,26329,26614,28131,28944,29035,29242,29533,29782,30048,30560,31552,32248,32541,32860,33396,33592,33978,34467,34905,35406,35990,36590,36897,37250,37779,38920,39075,39244,39827,39857,40124,43303,43302,43426,43424,43551,43549,43689,43684,43833,43828,43980,43975,44144,44140,44290,44287,43170,43167,43044,43040|6,15,23,23,23,23,23,23,27,26,25,230,236,237,236,234,38,39,41,191,44,31,31,200,222,26,27,27,27,27,193,192,4,17,236,20,248,4,254,29,20,137,264,292,193,14,33,189,280,30,173,288,25,171,277,29,238,28,255,11,250,250,246,256,269,269,263,262,23,19,120,226,238,181,59,25,18,244,268,275,36,253,258,90,1,200,229,48,47,47,47,12,185,210,44,137,172,5,197,-1,192,4,197,0,194,-10,186,0,195,2,194,-6,189,-1,195,-4,193|39948,39359,38556,38007,37468,36181,35633,33969,32799,31124,29314,28392,25824,23273,22050,21129,19215,17124,13635,11887,11195,7065,4781|6049,8744,15302,18212,18474,18757,20853,22309,23966,26820,30789,37235,38128,40160|158|137|120"
		,"That Was Easy|6500|793,801,809,817,825,4920,4932,4942,4951,4962,5518,5532,5556,5581,5627,5666,5715,5799,5856,5894,5915,5965,5821,5673,5745|-5,-2,-3,-3,1,2,3,3,2,6,82,39,5,-57,-89,-109,-117,-121,-84,-30,3,83,253,251,111|2178|3743|200|150|100"
		};
	public static int gameWidth = 0;
	
	public static World loadMap(int lev)
	{
		String contents = levels[lev];
		String delims = "[|]";
		String[] parsed = contents.split(delims);
		
		String name = parsed[0];
		int length = Integer.parseInt(parsed[1]);
		String[] temp = parsed[2].split("[,]");
		String[] temp2 = parsed[3].split("[,]");
		int[] ringsx = new int[temp.length];
		int[] ringsy = new int[temp.length];
		if(!parsed[2].equals("null"))
		{
			for(int x=0;x<temp.length;x++)
			{
				ringsx[x] = Integer.parseInt(temp[x]);
				ringsy[x] = Integer.parseInt(temp2[x]);
			}
		}
		else
		{
			ringsx = new int[0];
			ringsy = new int[0];
		}
		temp = parsed[4].split("[,]");
		temp2 = parsed[5].split("[,]");
		int[] zombies1;
		int [] zombies2;
		if(!parsed[4].equals("null"))
		{
			zombies1 = new int[temp.length];
			for(int x=0;x<temp.length;x++)
			{
				zombies1[x] = Integer.parseInt(temp[x]);
			}
		}
		else
		{
			zombies1 = new int[0];
		}
		if(!parsed[5].equals("null"))
		{
			zombies2 = new int[temp2.length];
			for(int x=0;x<temp2.length;x++)
			{
				zombies2[x] = Integer.parseInt(temp2[x]);
			}
		}
		else
		{
			zombies2 = new int[0];
		}
		int bluetime = Integer.parseInt(parsed[6]);
		int yellowtime = Integer.parseInt(parsed[7]);
		int redtime = Integer.parseInt(parsed[8]);
		World data = new World(name, length, ringsx, ringsy, zombies1, zombies2, bluetime, yellowtime, redtime);
		return data;
	}
	public static int[] getTimes(int ref)
	{
		String contents = levels[ref];
		String delims = "[|]";
		String[] parsed = contents.split(delims);
		
		int[] temp = new int[6];
		temp[0] = Integer.parseInt(parsed[6]);
		temp[1] = Integer.parseInt(parsed[7]);
		temp[2] = Integer.parseInt(parsed[8]);
		if(parsed[3].equals("null"))
		{
			temp[3] = 0;
		}
		else
		{
			temp[3] = parsed[3].split("[,]").length;
		}
		if(parsed[4].equals("null") && parsed[5].equals("null"))
		{
			temp[4] = 0;
		}
		else if(parsed[4].equals("null") || parsed[5].equals("null"))
		{
			temp[4] = 1;
		}
		else
		{
			temp[4] = parsed[4].split("[,]").length + parsed[5].split("[,]").length;
		}
		temp[5] = Integer.parseInt(parsed[1]);
		
		return temp;
	}
	public static String getName(int ref)
	{
		String contents = levels[ref];
		String delims = "[|]";
		String[] parsed = contents.split(delims);
		
		String temp = parsed[0];
		return temp;
	}
}
