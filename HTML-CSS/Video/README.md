# Displaying Videos in HTML

This markdown provides an explanation of how to use the `<video>` tag in HTML to embed and control videos in a webpage.

---

## `<video>` Tag

The `<video>` tag is used to embed video content in an HTML document. It provides a range of attributes to control the video playback and enhance user experience.

### Attributes Used in the Code

1. **`width`**
   - Defines the width of the video player in pixels.
   - Example: `width="400"` sets the video player to 400 pixels wide.

2. **`controls`**
   - Adds playback controls (play, pause, volume, etc.) to the video player.
   - Without this attribute, users cannot interact with the video player.

3. **`autoplay`**
   - Makes the video start playing automatically when the webpage is loaded.
   - Note: Most browsers restrict autoplay if the video is not muted.

4. **`muted`**
   - Starts the video with the audio muted by default.
   - Often used in conjunction with `autoplay` to comply with browser policies.

5. **`loop`**
   - Ensures the video will replay automatically when it reaches the end.

### `<source>` Tag

The `<source>` tag specifies multiple video files for the browser to choose from. This is useful for providing different formats to ensure compatibility across browsers.

#### Attributes of `<source>`

1. **`src`**
   - Specifies the path to the video file.
   - Example: `src="ZenryokuShounenVid.mp4"`.

2. **`type`**
   - Specifies the MIME type of the video file.
   - Example: `type="video/mp4"` or `type="video/wav"`.

### `<a>` Tag with `<video>`

The `<a>` tag is used to wrap the `<video>` element, making it clickable. When clicked, it redirects the user to the URL specified in the `href` attribute.

#### Attributes of `<a>`

1. **`href`**
   - Specifies the destination URL when the video is clicked.
   - Example: `href="https://youtu.be/IvDTkTKi5pA?si=kf6jWGv6PumtVS_g"`.

2. **`target="_blank"`**
   - Opens the linked URL in a new tab.

---

By using the `<video>` tag with these attributes and `<source>` elements, you can embed videos with robust functionality, ensuring compatibility and a seamless user experience.
