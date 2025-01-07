# Explanation of HTML Code for Favicon Setup

This HTML code demonstrates how to set up a favicon for a webpage. Below is an explanation of the key components and attributes used in the code:

## Code Explanation

### 1. `<!DOCTYPE html>`
- Declares the document type as HTML5.

### 2. `<html>`
- The root element of the HTML document.

### 3. `<head>`
- Contains metadata about the document such as its title and links to resources like stylesheets or icons.

### 4. `<title>`
- Specifies the title of the webpage, which is displayed on the browser tab. In this example, the title is `IconTest`.

### 5. `<link rel="icon" type="image/jpg" href="image.jpg">`
- Adds a favicon to the webpage.

#### Explanation of Attributes:
- `rel="icon"`: Specifies the relationship between the current document and the linked resource, indicating that this is the favicon.
- `type="image/jpg"`: Specifies the MIME type of the linked file. In this case, it is a JPG image.
- `href="image.jpg"`: Specifies the URL or file path to the image that will be used as the favicon.

### 6. `<body>`
- Contains the content of the HTML document. In this case, it is empty as the focus is on setting the favicon.

## Purpose of Favicon
A favicon is a small icon that appears in the browser tab next to the page title. It helps users quickly identify and distinguish between different webpages, especially when multiple tabs are open.

## Notes
- The `image.jpg` file must be present in the same directory as the HTML file for this example to work.
- You can use other image formats like `.png` or `.ico` by updating the `type` attribute accordingly.
- Favicons are also used when saving a webpage as a bookmark.
