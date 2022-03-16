import React from "react";
import './Image.scss';

const Image = ({src, alt = '' }) => (<img src={src} alt={alt} className="image" loading="lazy" width="275px" height="206px" />);

export default Image;