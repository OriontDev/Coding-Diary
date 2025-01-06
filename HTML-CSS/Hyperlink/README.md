# Hyperlinks in HTML

This README explains the concepts and implementation of hyperlinks using the provided HTML code. Hyperlinks are one of the fundamental features of HTML, enabling navigation between different resources on the web.

## Code Explanation

```html
<!DOCTYPE html>

<html>
    <head>
        <title>Html :3</title>
    </head>
    <body>
        <a href="https://www.youtube.com/watch?v=yyMqGOyT2OE&list=RDyyMqGOyT2OE&start_radio=1"
        target="_blank"
        title="This is a title attribute"> <!--a means anchor btw, href is called an , target="_Blank" means link is opened in new tab not same tab, title add a tooltip-->
            click me
        </a>

        <br>

        <a href="../Basic/index.html">
            Html Basic
        </a>

        <br>

        <a href="mailto:fakeyfakey@gmail.com"> <!--Basically its to send mail-->
            Email me!
        </a>

    </body>
</html>
```

### Key Components of Hyperlinks

#### 1. `<a>` Tag
The `<a>` tag defines a hyperlink (anchor) in HTML. It allows users to navigate to a different web page, section, or resource.

#### 2. `href` Attribute
The `href` attribute specifies the destination of the hyperlink. It can point to various types of URLs or paths:
- **Absolute URL**: Links to an external website.
  ```html
  <a href="https://www.example.com">Go to Example</a>
  ```
- **Relative URL**: Links to another file or directory in your project.
  ```html
  <a href="../Basic/index.html">Go to HTML Basics</a>
  ```
- **Email Links**: Uses the `mailto:` scheme to send an email.
  ```html
  <a href="mailto:someone@example.com">Send Email</a>
  ```

#### 3. `target` Attribute
The `target` attribute determines where the hyperlink will open. Common values:
- `_blank`: Opens the link in a new tab or window.
  ```html
  <a href="https://example.com" target="_blank">Open in New Tab</a>
  ```
- `_self`: Opens the link in the same tab (default behavior).

#### 4. `title` Attribute
The `title` attribute provides additional information about the link. This information is displayed as a tooltip when the user hovers over the hyperlink.
```html
<a href="https://example.com" title="Visit Example">Hover me</a>
```

#### 5. `<br>` Tag
The `<br>` tag creates a line break. It is used here to separate the hyperlinks visually.

## Code Breakdown

### Example 1: External Link
```html
<a href="https://www.youtube.com/watch?v=yyMqGOyT2OE&list=RDyyMqGOyT2OE&start_radio=1"
target="_blank"
title="This is a title attribute">
    click me
</a>
```
- Links to a YouTube video.
- `target="_blank"`: Opens the link in a new tab.
- `title`: Displays a tooltip when hovered over.

### Example 2: Relative Link
```html
<a href="../Basic/index.html">
    Html Basic
</a>
```
- Links to `index.html` located in the `Basic` folder, one level up from the current folder.

### Example 3: Email Link
```html
<a href="mailto:fakeyfakey@gmail.com">
    Email me!
</a>
```
- Opens the user’s default email client to send an email to `fakeyfakey@gmail.com`.

## Additional Notes
- Hyperlinks can link to images, files, or specific sections of a page (using IDs and fragments).
- Properly structuring and naming paths in your project ensures that relative links work as expected.
- Use meaningful `title` attributes to enhance user accessibility.

---
With these notes, you have a comprehensive understanding of how to use hyperlinks effectively in HTML!
