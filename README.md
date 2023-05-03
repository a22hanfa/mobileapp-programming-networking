
# Rapport

I den här uppgiften handlade om att hämta JSON-data från ett API, göra om det till lista av bergs-objekt och visa det med hjälp av en RecyclerView.

JSON-strängen tas emot av MainActivity och lägger till den i en lista av Mountain-objekt tillsammans med hjälp av Gson-biblioteket.
```
Type type = new TypeToken<List<Mountain>>() {}.getType();
items = gson.fromJson(json, type);
```

I Mountain-klassen om hanteras texten från API till männskligt läsbar.
```
@Override
public String toString() {
    return "Mountain Details:\n" +
    "Name: " + Name + '\n' +
    "Location: " + Location + '\n' +
    "Height: " + Height + " meters\n";
}
```

Listan med Mountain-objekt visas på skärmen med hjälp av RecyclerView. En adapter för RecyclerView, MountainRecyclerViewAdapter skapas, som skapar en enkel layout för objekten.
```
adapter = new MountainRecyclerViewAdapter(this, items, new MountainRecyclerViewAdapter.OnClickListener() {
    @Override
    public void onClick(Mountain item) {
        Toast.makeText(MainActivity.this, item.toString(), Toast.LENGTH_SHORT).show();
    }
});
RecyclerView view = findViewById(R.id.recyclerView);
view.setLayoutManager(new LinearLayoutManager(this));
view.setAdapter(adapter);
```

Varje Mountain-objekt visas som en text.
```
holder.mountain.setText(items.get(position).toString());
```

MountainRecyclerViewAdapter är inställd för att skapa en ViewHolder för varje Mountain-objekt. 
``
@Override
@NonNull
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
return new ViewHolder(layoutInflater.inflate(R.layout.mountain_item, parent, false));
}
``

