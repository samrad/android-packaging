android-packaging
=================

Augmented reality application for packaging

The app is an integration of Qualcomm AR SDK (Vuforia) 1.6 (NDK) and jPCT-AE rendering engine (Java). QCAR is used to track object based on features points extracted beforehand. Once the object is recognized the transformation matrix is sent back to Java from native codes which then jPCT-AE uses to render and superimpose the graphics and animation.

The 3D model is an MD model with a separate texture which is loaded into memory as bitmap and mapped to 3D geometry. The animation is a simple vertex animation and it's created in 3D Studio Max.

Watch the demo on YouTube

[![DEMO](http://img.youtube.com/vi/chsHh0pEhzw/0.jpg)](http://www.youtube.com/watch?v=chsHh0pEhzw)
