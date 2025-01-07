# Understanding HTML Tables

HTML tables allow you to display data in rows and columns, providing a structured layout for information. Below, we break down the key elements and attributes used in creating an HTML table, as demonstrated in the code.

## Key Elements and Attributes

### 1. `<table>`
This is the main container for the table.
- **`border="1"`**: Adds a border around the table and its cells.
- **`style="background-color: black;"`**: Sets the background color of the entire table to black.

### 2. `<tr>`
Defines a table row. Each `<tr>` groups table cells together horizontally.
- **`align="center"`**: Aligns the content of the cells in the row to the center horizontally.
- **`style="background-color: aliceblue;"`**: Sets the background color of the row to `aliceblue`.

### 3. `<th>`
Defines a header cell in a table. Header cells are bold and centered by default.
- **`width="100"`**: Specifies the width of the header cell in pixels.

### 4. `<td>`
Defines a standard data cell in a table.
- These cells contain the actual data, such as "9-5" or "Closed".

### 5. Nesting Structure
The table has rows created using `<tr>`. Each row contains either header cells (`<th>`) or data cells (`<td>`). Headers and data align neatly within rows and columns.

### Example Structure:
```html
<table border="1" style="background-color: black;">
    <tr align="center" style="background-color: aliceblue;">
        <th width="100">Sunday</th>
        <th width="100">Monday</th>
        <th width="100">Tuesday</th>
        <th width="100">Wednesday</th>
        <th width="100">Thursday</th>
        <th width="100">Friday</th>
        <th width="100">Saturday</th>
    </tr>
    <tr align="center" style="background-color: aliceblue;">
        <td>Closed</td>
        <td>9-5</td>
        <td>9-5</td>
        <td>9-5</td>
        <td>9-5</td>
        <td>9-5</td>
        <td>10-6</td>
    </tr>
</table>
```

## Explanation of the Example
- **Header Row (`<tr>` with `<th>`):** Contains the days of the week as headers. Each header has a fixed width of `100px` and is styled with a light `aliceblue` background.
- **Data Row (`<tr>` with `<td>`):** Displays the store hours for each day. Data is centered and follows the header structure.

## Notes on Styling
- **`border`:** Adding the `border="1"` attribute ensures each cell is outlined.
- **Background Colors:** Inline styles are used to add contrasting colors to make the table visually appealing.
- **Alignment:** Center alignment ensures that data is properly positioned within cells.

## Output
This code renders a clean table with a header row and a data row, showing store hours for each day of the week.
