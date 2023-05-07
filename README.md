# ExpandableMaster
First Library Android ExpandableMaster ListView dan GridView
Library Android 


# Cara 1
* Install Library ExpandableMaster
```
dependencies {
    implementation 'com.github.AnazuDev:ExpandableMaster:1.1.1b'

}
```
# Cara 2
* Convert Linear Layout / Widget ListView
```
<com.anasbex.expandable.ExpandableMain
android:id="@+id/listview1"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:padding="8dp"
android:choiceMode="none" />

```
# Cara 3
* Contoh ListView Gue
```
private void initializeLogic() {

		n = 1000;

		for(int _repeat10 = 0; _repeat10 < (int)(50); _repeat10++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("key", "TES".concat(String.valueOf((long)(n))));
				listmap.add(_item);
			}
			
			listview1.setAdapter(new Listview1Adapter(listmap));
		}
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		listview1.setExpanded(true);
	}

```
# Panggilkan ExpandableMaster
* listview1 adalah id content!
```

	listview1.setExpanded(true);
```