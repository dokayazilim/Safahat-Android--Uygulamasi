package com.dokasoft.safahat;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

public class giris extends ListActivity{
    String stringarray[]={"Fatih Camii","Hasta","Tevhid Yahut Feryad","K�fe","Durmayal�m","Has�r","Ge�inme Belas�","Meyhane","Mezarl�k","Bayram","Hasbihal","Selma","Merhum �brahim Bey","Azim","Seyfi Baba","�nsan","K�r Neyzen","Acem �ah�","�stibdat","H�rriyet","Kocakar� �le �mer","Ezanlar","Canan Yurdu","Bir Mersiye","Dirvas","Mahalle Kahvesi","K�se �mam","K�sa �iirler","Ahiret Yolu","�sti�rak","Amin Alay�","Hasbihal","Bebek Yahut Hakk-� Karar","Yemi��i �htiyar"};
	@Override
	protected void onListItemClick(android.widget.ListView l, View v,
			int position, long id) {
		if (position == 0)
		{
			startActivity(new Intent("com.dokasoft.safahat.KITAPBIR"));	
			
		}
		else if(position == 1)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPIKI"));		
		}	
		else if(position == 2)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPUC"));		
		}	
		else if(position == 3)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPDORT"));		
		}	
		else if(position == 4)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPBES"));		
		}	
		else if(position == 5)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPALTI"));		
		}	
		else if(position == 6)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYEDI"));		
		}	
		else if(position == 7)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPSEKIZ"));		
		}	
		else if(position == 8)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPDOKUZ"));		
		}	
		else if(position == 9)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPON"));		
		}	
		else if(position == 10)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPONBIR"));		
		}	
		else if(position == 11)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPONIKI"));		
		}	
		else if(position == 12)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPONUC"));		
		}	
		else if(position == 13)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPONDORT"));		
		}	
		else if(position == 14)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPONBES"));		
		}
		else if(position == 15)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPONALTI"));		
		}
		else if(position == 16)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPONYEDI"));		
		}
		else if(position == 17)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPONSEKIZ"));		
		}
		else if(position == 18)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPONDOKUZ"));		
		}
		else if(position == 19)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYIRMI"));		
		}
		else if(position == 20)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYIRMIBIR"));		
		}
		else if(position == 21)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYIRMIIKI"));		
		}
		else if(position == 22)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYIRMIUC"));		
		}
		else if(position == 23)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYIRMIDORT"));		
		}
		else if(position == 24)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYIRMIBES"));		
		}
		else if(position == 25)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYIRMIALTI"));		
		}
		else if(position == 26)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYIRMIYEDI"));		
		}
		else if(position == 27)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYIRMISEKIZ"));		
		}
		else if(position == 28)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPYIRMIDOKUZ"));		
		}
		else if(position == 29)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPOTUZ"));		
		}
		else if(position == 30)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPOTUZBIR"));		
		}
		else if(position == 31)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPOTUZIKI"));		
		}
		else if(position == 32)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPOTUZUC"));		
		}
		else if(position == 33)
		{
			
			startActivity(new Intent("com.dokasoft.safahat.KITAPOTUZDORT"));		
		}
		super.onListItemClick(l, v, position, id);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stringarray));
	}

}
